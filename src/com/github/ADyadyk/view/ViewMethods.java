package com.github.ADyadyk.view;

import com.github.ADyadyk.model.Toy;
import com.github.ADyadyk.model.ToyComparator;

import java.util.*;

public class ViewMethods implements ViewMethodsable, Promptable{

    @Override
    public Toy[] putToys(int lengthArray, int idToy){
        Toy[] array = new Toy[lengthArray];
        for (int i = 0; i < array.length; i++) {
            System.out.println();
            int number = idToy + i;
            System.out.println("Игрушка №" + number + ":");
            String name = promptString("Ввидите название игрушки: ");
            int weight = promptInt("Введите вес игрушки (частоту выпадения): ");
            array[i] = new Toy(number, name, weight);
        }
        return array;
    }
    @Override
    public PriorityQueue<Toy> transformationFromArrayToPriorityQueue(Toy[] array){
        PriorityQueue<Toy> queue = new PriorityQueue<>(new ToyComparator());
        queue.addAll(Arrays.asList(array).subList(0, array.length));
        return queue;
    }
    @Override
    public void printArray(Toy[] array){
        for (Toy toy : array) {
            System.out.println(toy);
        }
    }
    @Override
    public void printQueue(PriorityQueue<Toy> queue){
        //  с помощью данного метода во время перебора очереди она не уничтожается
        List<Toy> toys = new ArrayList<>();
        for (Toy toy : queue){
            toys.add(toy);
        }
        toys.sort(new ToyComparator());
        for (int i = 0; i < toys.size(); i++) {
            System.out.println(toys.get(i));
        }
    }
    @Override
    public void printAllQueue(PriorityQueue<Toy> queueFirst, PriorityQueue<Toy> queueSecond, PriorityQueue<Toy> queueThird){
        System.out.println();
        System.out.println("Cодержимое отсеков с игрушками: ");
        System.out.println("Упорядоченные игрушки в первом отсеке:");
        printQueue(queueFirst);
        System.out.println("Упорядоченные игрушки во втором отсеке:");
        printQueue(queueSecond);
        System.out.println("Упорядоченные игрушки в третьем отсеке:");
        printQueue(queueThird);
        System.out.println();
    }
    @Override
    public String promptString(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }
    @Override
    public int promptInt(String message){
        return Integer.parseInt(promptString(message));
    }
    @Override
    public boolean promptBoolean(String message){
        String answer = promptString(message);
        if(answer.equals("yes")) return true;
        else return false;
    }
}
