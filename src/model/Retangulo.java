package model;

public class Retangulo{

    public int largura;
    public int altura;

    public int valorDaArea(){
        return this.largura*this.altura;
    }

    public int valorDoPerimetro(){
        return this.largura+this.largura+this.altura+this.altura;
    }

    public String mostarDados(){
        return "\nLargura: "+this.largura+
                "\nAltura: "+this.altura+
                "\nArea: "+this.valorDaArea()+
                "\nPerimetro: "+this.valorDoPerimetro();
    }
}
