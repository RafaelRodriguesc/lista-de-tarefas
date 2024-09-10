package br.com.cdb.listadetarefas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Tarefas {
    private ArrayList<String> listaDeTarefas;
    private Scanner input;

    public Tarefas() {
        this.listaDeTarefas = new ArrayList<>();
        this.input = new Scanner(System.in);
    }

    public void adicionarTarefa() {
        System.out.println("Digite a tarefa a ser adicionada:");
        String novaTarefa = input.nextLine();
        
        if (tarefaExiste(novaTarefa)) {
            System.out.println("Esta tarefa já existe na lista.");
        } else {
            listaDeTarefas.add(novaTarefa);
            System.out.println("Tarefa adicionada com sucesso!");
        }
    }

    public void removerTarefa() {
        System.out.println("Digite a tarefa a ser removida:");
        String tarefaRemover = input.nextLine();
        
        if (listaDeTarefas.contains(tarefaRemover)) {
            listaDeTarefas.remove(tarefaRemover);
            System.out.println("Tarefa removida com sucesso!");
        } else {
            System.out.println("Esta tarefa não existe na lista.");
        }
    }

    public void listarTarefas() {
        System.out.println("Lista de Tarefas:");
        int i = 0;
        for (String tarefa : listaDeTarefas) {
        	i++;
            System.out.println(i + " - " + tarefa);
        }
    }

    public void listarTarefasEmOrdemAlfabetica() {
        Collections.sort(listaDeTarefas);
        listarTarefas();
    }

    public void encerrar() {
        input.close();
    }

    private boolean tarefaExiste(String tarefa) {
        return listaDeTarefas.contains(tarefa);
    }
    
    
}
