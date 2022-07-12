package com.jackmouse.context;

public interface ApplicationListener<E extends ApplicationEvent>{

    /**
     * Handle an application event.
     * @param event the event to respond to
     */
    void onApplicationEvent(E event);

}
