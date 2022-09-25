package com.mycompany.modelomotorveiculoteste;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


/**
 *
 * @author walterribas
 */
public class Veiculo {
    private String placa;
    private String marca;
    private String modelo;
    private String cor;
    private float velocMax;
    private int qtdRodas;
    private Motor motor;
    String [][] matrix;
    Scanner scanner = new Scanner(System.in);

    // constructor
    public Veiculo(){
        this.placa = "";
        this.marca = "";
        this.modelo = "";
        this.cor = "";
        this.velocMax = 0.0F;
        this.qtdRodas = 0;
        motor = new Motor();
    }

    // obter o número de registro de veículos para entrada
    public void getVeiculos(){
        System.out.print("Informe a quantidade de registros para entrada: ");
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        String s = "";
        try {
            s = (read.readLine());
        } catch (IOException e) {
            System.out.println("Erro de entrada");
        }
        int qtdRegistros = Integer.parseInt(s);
        matrix = new String[qtdRegistros][8];
    }

    // cadastro do registro de veiculos
    public void getRegistros(){
        for (int i = 0; i < matrix.length; i++) {
            System.out.printf("%nVeículo %d%n", i+1);
            System.out.print("Placa: ");
            setPlaca(scanner.next());
            matrix[i][0] = getPlaca();
            System.out.print("Marca: ");
            setMarca(scanner.next());
            matrix[i][1] = getMarca();
            System.out.print("Modelo: ");
            setModelo(scanner.next());
            matrix[i][2] = getModelo();
            System.out.print("cor: ");
            setCor(scanner.next());
            matrix[i][3] = getCor();
            System.out.print("Velocidade Máxima: ");
            setVelocMax(scanner.nextFloat());
            matrix[i][4] = String.valueOf(getVelocMax());
            System.out.print("Qtd Rodas: ");
            setQtdRodas(scanner.nextInt());
            matrix[i][5] = String.valueOf(getQtdRodas());
            System.out.print("Qtd Pistões: ");
            motor.setQtdPist(scanner.nextInt());
            matrix[i][6] = String.valueOf(motor.getQtdPist());
            System.out.print("Potência: ");
            motor.setPotencia(scanner.nextInt());
            matrix[i][7] = String.valueOf(motor.getPotencia());
        }
    }

    public void printRegistros(){
        for (int i = 0; i < matrix.length; i++) {
            System.out.println("\n\n============================");
            System.out.printf("Veículo %d%n", i+1);
            System.out.printf("Placa: %s%n", matrix[i][0]);
            System.out.printf("Marca: %s%n", matrix[i][1]);
            System.out.printf("Modelo: %s%n", matrix[i][2]);
            System.out.printf("cor: %s%n", matrix[i][3]);
            System.out.printf("Velocidade Máxima: %s%n", matrix[i][4]);
            System.out.printf("Qtd Rodas: %s%n", matrix[i][5]);
            System.out.printf("Qtd Pistões: %s%n", matrix[i][6]);
            System.out.printf("Potência: %s%n", matrix[i][7]);
            System.out.println("============================");
        }
    }

    // getters and setters
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public float getVelocMax() {
        return velocMax;
    }

    public void setVelocMax(float velocMax) {
        this.velocMax = velocMax;
    }

    public int getQtdRodas() {
        return qtdRodas;
    }

    public void setQtdRodas(int qtdRodas) {
        this.qtdRodas = qtdRodas;
    }
}
