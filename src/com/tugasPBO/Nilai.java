package com.tugasPBO;

public class Nilai {
    private double uts,quiz,uas;
    private double nilai;
    public Nilai(double quiz,double uts,double uas){
        this.quiz = quiz;
        this.uas = uas;
        this.uts = uts;
    }

    public double getUts(){
        return uts;
    }

    public double getQuiz(){
        return quiz;
    }

    public double getUas(){
        return uas;
    }

    public double NilaiAkhir(double quiz,double uas,double uts){
        return ((0.20 * quiz) + (0.30 * uts) + (0.50 * uas));
    }

    public String Index(double nilai){
        if(nilai > 80 && nilai <= 100){
            return "D";
        }else if(nilai > 68 && nilai <= 80){
            return "B";
        }else if(nilai > 56 && nilai <= 68){
            return "C";
        }else if(nilai > 45 && nilai <= 56){
            return "D";
        }else{
            return "E";
        }
    }

    public String keterangan(String index){
        String ket;
        switch(index){
            case "A":
                ket = "Sangat baik";
                break;
            case "B":
               ket = "Baik";
               break;
            case "C":
                ket =  "Cukup";
                break;
            case "D":
                ket =  "Kurang";
                break;
            case "E":
                ket = "Sangat kurang";
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + index);
        }
        return ket;
    }
}
