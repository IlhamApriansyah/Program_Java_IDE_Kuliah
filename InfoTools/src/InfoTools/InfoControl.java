/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InfoTools;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Administrator
 */
public class InfoControl {
    private List<InfoView> list;
    private InfoModel infomodel;
    
public InfoControl(){
    list = new ArrayList<InfoView>();
    infomodel = new InfoModel ("Panas","Cerah terik");
}

public void addInfoView (InfoView viewInfo){
    list.add(viewInfo);
}

public void updateMessage(String Message){
    infomodel.setMessage(Message);
    for (InfoView infoView : list){
        infoView.getLblMessage().setText("Message :" +Message);
    }   
}

public void updateWeather(String Weather){
    infomodel.setWeather(Weather);
    for (InfoView infoView : list){
        infoView.getLblWeather().setText("Weather :" +Weather);
      }
}
}
