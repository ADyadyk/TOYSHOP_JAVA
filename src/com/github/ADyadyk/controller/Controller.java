package com.github.ADyadyk.controller;

import com.github.ADyadyk.model.Toy;
import com.github.ADyadyk.model.repository.ModelMethods;

import java.util.PriorityQueue;

public class Controller {
    public static final ModelMethods MODEL_METHODS = new ModelMethods();

    public void getController(PriorityQueue<Toy> queueFirst, PriorityQueue<Toy> queueSecond, PriorityQueue<Toy> queueThird){
        MODEL_METHODS.get(queueFirst, queueSecond, queueThird);
    }
}
