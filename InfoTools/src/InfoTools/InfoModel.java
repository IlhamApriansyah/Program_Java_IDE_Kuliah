/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InfoTools;

/**
 *
 * @author Administrator
 */
public class InfoModel {
    private String message;
    private String weather;
    
    public InfoModel (String message, String weather){
        this.message = message;
        this.weather = weather;
    }

    public String getMessage() {
        return message;
    }

    public String getWeather() {
        return weather;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setWeather(String weather) {
        this.weather = weather;
    }
    
    
}
