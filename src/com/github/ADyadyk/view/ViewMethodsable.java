package com.github.ADyadyk.view;

import com.github.ADyadyk.model.Toy;

import java.util.PriorityQueue;

public interface ViewMethodsable {
    /**
     * Метод, складывающий игрушки в отсеки автомата для розыгрышей (в массив)
     * @param lengthArray
     * @param idToy
     * @return
     */
    Toy[] putToys(int lengthArray, int idToy);

    /**
     * Метод, трансформирующий Array в PriorityQueue
     * @param array
     * @return
     */
    PriorityQueue<Toy> transformationFromArrayToPriorityQueue(Toy[] array);

    /**
     * Метод, печатающий в консоль Array
     * @param array
     */
    void printArray(Toy[] array);

    /**
     * Метод, печатающий в консоль PriorityQueue
     * @param queue
     */
    void printQueue(PriorityQueue<Toy> queue);

    /**
     * Метод, печатающий в консоль все отсеки автомата (все PriorityQueue)
     * @param queueFirst
     * @param queueSecond
     * @param queueThird
     */
    void printAllQueue(PriorityQueue<Toy> queueFirst, PriorityQueue<Toy> queueSecond, PriorityQueue<Toy> queueThird);
}
