package com.github.ADyadyk.view;

import com.github.ADyadyk.controller.Controller;
import com.github.ADyadyk.model.Toy;

import java.util.PriorityQueue;

public class View {
    public static final ViewMethods VIEW_METHODS = new ViewMethods();
    public static final Controller CONTROLLER = new Controller();
    public static void run(){
        // Начало заполнения автомата игрушками
        int lengthArrays= VIEW_METHODS.promptInt("Введите какое количество игрушек" +
                " будет храниться в каждом отсеке: ");

        // Заполнение первого отсека игрушками:
        int idFirstToyInArrayFirst = 1;
        Toy[] arrayFirst = VIEW_METHODS.putToys(lengthArrays, idFirstToyInArrayFirst);
        System.out.println();
        System.out.println("Игрушки, которые будут сложены в первый отсек");
        VIEW_METHODS.printArray(arrayFirst);

        // Заполнение второго отсека игрушками:
        int idFirstToyInArraySecond = idFirstToyInArrayFirst + lengthArrays;
        Toy[] arraySecond = VIEW_METHODS.putToys(lengthArrays, idFirstToyInArraySecond);
        System.out.println();
        System.out.println("Игрушки, которые будут сложены во второй отсек");
        VIEW_METHODS.printArray(arraySecond);

        // Заполнение третьего отсека игрушками:
        int idFirstToyInArrayThird = idFirstToyInArraySecond + lengthArrays;
        Toy[] arrayThird = VIEW_METHODS.putToys(lengthArrays, idFirstToyInArrayThird);
        System.out.println();
        System.out.println("Игрушки, которые будут сложены в третий отсек");
        VIEW_METHODS.printArray(arrayThird);
        // Заполнение автомата игрушками завершено

        // Получим очереди в каждом отсеке игрушек (по порядку их выпадания):
        PriorityQueue<Toy> queueFirst = VIEW_METHODS.transformationFromArrayToPriorityQueue(arrayFirst);
        PriorityQueue<Toy> queueSecond = VIEW_METHODS.transformationFromArrayToPriorityQueue(arraySecond);
        PriorityQueue<Toy> queueThird = VIEW_METHODS.transformationFromArrayToPriorityQueue(arrayThird);

        // Вывод в консоль упорядоченного содержимого отсеков автомата для розыгрыша игрушек:
        System.out.println("До начала розыгрыша:");
        VIEW_METHODS.printAllQueue(queueFirst, queueSecond, queueThird);


        // Розыгрыш игрушек
        boolean flag = true;
        System.out.println("Розыгрыш игрушек:");
        while (flag){
            // Запрос на количество розыгрышей:
            int quantity = VIEW_METHODS.promptInt("Чтобы запустить розыгрыш игрушек, какое количество игрушек разыгрывается: ");
            while (quantity > 0){
                CONTROLLER.getController(queueFirst, queueSecond, queueThird);
                quantity--;
            }
            // Содержимое отсеков после очередного прогона:
            System.out.println("После очередного розыгрыша:");
            VIEW_METHODS.printAllQueue(queueFirst, queueSecond, queueThird);

            // Запрос на продожение розыгрыша:
            flag = VIEW_METHODS.promptBoolean("Вы хотите продолжить розыгрыш? Если да, то введите yes: ");
        }
    }
}
