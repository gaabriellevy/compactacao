/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.compactacao;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class Compactacao {

    public static void main(String[] args) throws IOException {
        System.out.print("Escreva o arquivo de entrada: ");
        Scanner in = new Scanner(System.in);
        String caminhoArquivoEntrada = in.nextLine();

        File arquivoEntrada = new File(caminhoArquivoEntrada);
        Scanner leitorEntrada = new Scanner(arquivoEntrada);
        File arquivoSaida = new File("compactado.txt");
        FileWriter writer = new FileWriter(arquivoSaida);

        Compactador compactador = new Compactador();

        while(leitorEntrada.hasNextLine()) { // lê as linha do arquivo
            String linha = leitorEntrada.nextLine();
            String linhaCompactada = compactador.frequenciaCaracteres(linha+'\n');
            writer.write(linhaCompactada);
        }
        
        writer.close();
    }
}
