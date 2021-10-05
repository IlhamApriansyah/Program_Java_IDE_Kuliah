/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class superclass  {
    private String nama;
    private int no, nim;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public int getNim() {
        return nim;
    }

    public void setNim(int nim) {
        this.nim = nim;
    }
    
    public static void main(String []args){
        subclass2 Data = new subclass2();
        superclass Data2 = new superclass();
        Data.setJurusan("Teknik Informatika");
        Data.setNilai(80);
        Data2.setNo(0+1);
        Data2.setNim(1904030007);
        Data2.setNama("Ilham Apriansyah");
        
        
        
        System.out.println("\tData Akademik Mahasiswa");
        System.out.println("===================================");
        System.out.println("No\t: "+Data2.getNo());
        System.out.println("NIM\t: "+Data2.getNim());
        System.out.println("Nama\t: "+Data2.getNama());
        System.out.println("Jurusan\t: "+Data.getJurusan());
        System.out.println("Nilai:\t: "+Data.getNilai());
        System.out.println("===================================");
    }
}
