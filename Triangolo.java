/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author NiruuGopa
 */
public class Triangolo {

    private double lato1;
    private double lato2;
    private double lato3;

    public Triangolo(double lato1, double lato2, double lato3) {
        this.lato1 = lato1;
        this.lato2 = lato2;
        this.lato3 = lato3;
    }

    public double calcolaPerimetro(){

        return lato1 + lato2 + lato3;
    }

    public double calcolaArea(){

        double semiPerimetro = this.calcolaPerimetro() / 2;
        double ris = semiPerimetro * (semiPerimetro - lato1) * (semiPerimetro - lato2) * (semiPerimetro - lato3);

        return Math.sqrt(ris);
    }

    public String tipoTriangolo(){

        if(lato1 == lato2 && lato2 == lato3 && lato3 == lato1){

            return "Equilatero";
        }else if(lato3 == lato2 && lato3 != lato1 && lato2 != lato1){

            return "Isoscele";
        }else if(lato1 == lato2 && lato1 != lato3 && lato2 != lato3){

            return "Isoscele";
        }else if(lato1 == lato3 && lato1 != lato2 && lato3 != lato2){

            return "Isoscele";
        }else{

            return "Scaleno";
        }
    }
}