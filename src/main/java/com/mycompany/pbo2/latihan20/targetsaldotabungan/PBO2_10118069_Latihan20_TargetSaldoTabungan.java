/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pbo2.latihan20.targetsaldotabungan;

/**
 *
 * @author asus
 * Nama     : Muhamad Rizqi Ramdani
 * Kelas    : PBO2
 * Nim      : 10118069
 * Deskripsi Program : Target Saldo Tabungan
 */
public class PBO2_10118069_Latihan20_TargetSaldoTabungan {
    public static int saldoawal = 3500000;
    public static void main(String[] args) {
        for (int i = 1; i<=8; i++){
             saldoawal = saldoawal + (int)(saldoawal * 0.08);
             System.out.printf("Saldo di Bulan ke-"+ i +" Rp. %,d%n" , saldoawal);
        }
    }
}
