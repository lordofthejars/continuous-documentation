package org.todo;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "todo")
public class Todo {

    private String todo;
    private boolean done;

    public Todo(String todo, boolean done) {
        this.todo = todo;
        this.done = done;
    }

    public String getTodo() {
        return todo;
    }

    public void setTodo(String todo) {
        this.todo = todo;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }
}
