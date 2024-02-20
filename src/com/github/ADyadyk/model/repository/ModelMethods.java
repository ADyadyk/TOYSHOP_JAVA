package com.github.ADyadyk.model.repository;

import com.github.ADyadyk.model.Toy;

import java.io.FileWriter;
import java.io.IOException;
import java.util.PriorityQueue;
import java.util.Random;

public class ModelMethods implements Methodsable{
    @Override
    public int getRandomNumber(){
        Random random = new Random();
        int number = random.nextInt(101);

        if (number < 21) return 1;
        if (number < 41) return 2;
        else return 3;
    }
    @Override
    public void printToFile(Toy toy){
        String path = "src/com/github/ADyadyk/data/data.txt";
        try(FileWriter fileWriter = new FileWriter(path, true)){
            fileWriter.write(toy + "\n");
            fileWriter.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    @Override
    public Toy getToy(PriorityQueue<Toy> queue){
        if(queue.isEmpty()) return null;
        return queue.remove();
    }
    @Override
    public void get(PriorityQueue<Toy> queueFirst, PriorityQueue<Toy> queueSecond, PriorityQueue<Toy> queueThird){

            // определим очередь, из которой будет выпадать игрушка:
            int numberOfQueue = getRandomNumber();
            Toy toy = new Toy();
            if(numberOfQueue == 1) {
                if(queueFirst.isEmpty()) toy = null;
                else toy = getToy(queueFirst);
            }
            if(numberOfQueue == 2) {
                if(queueFirst.isEmpty()) toy = null;
                else toy = getToy(queueSecond);
            }
            if(numberOfQueue == 3) {
                if(queueFirst.isEmpty()) toy = null;
                else toy = getToy(queueThird);
            }

            if(toy != null){
                printToFile(toy);
                System.out.println(toy);
            }
            else System.out.println("Вы проиграли! Вам выпал отсек без игрушки!");
    }
}
