/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBO10.pkg10119902.Latihan33.UserLogin;

import java.util.Scanner;

/**
 *
 * @author 
 * NAMA    : Muhammad Nurkholiq
 * KELAS   : PBO10K
 * NIM     : 10119902
 * Deskripsi Program : Program Ini Berisi Program Untuk Menampilkan User Login
 * 
 */
public class Main {
    private static String usName, passWord;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan Username : ");
        usName = scanner.nextLine();
        System.out.print("Masukkan Password : ");
        passWord = scanner.nextLine();
        User user1 = new User();
        user1.pengecekkanLogin(usName,passWord);
    }
}