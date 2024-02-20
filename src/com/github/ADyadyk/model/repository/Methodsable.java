package com.github.ADyadyk.model.repository;

import com.github.ADyadyk.model.Toy;

import java.util.PriorityQueue;

public interface Methodsable {
    /**
     * Метод, выдающий рандомно цифры 1, 2 и 3.
     * Частота выпадения:
     * 1 - 20%
     * 2 - 20%
     * 3 - 60%
     * @return
     */
    int getRandomNumber();

    /**
     * Метод, записывающий в файл передаваемую игрушку
     * @param toy
     */
    void printToFile(Toy toy);

    /**
     * Метод, извлекающий из переданной в него PriorityQueue игрушку
     * @param queue
     * @return
     */
    Toy getToy(PriorityQueue<Toy> queue);

    /**
     * Метод, проводящий розыгрыш игрушек
     * @param queueFirst
     * @param queueSecond
     * @param queueThird
     */
    void get(PriorityQueue<Toy> queueFirst, PriorityQueue<Toy> queueSecond, PriorityQueue<Toy> queueThird);
}
