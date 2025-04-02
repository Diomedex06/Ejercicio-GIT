package co.edu.etitc.sistemas.programacion4;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var contexto = new AnnotationConfigApplicationContext();
        contexto.register(HolaMundo.class);
        contexto.refresh();
        var instancia = contexto.getBean(HolaMundo.class);
        instancia.saludar();
        contexto.close();
        
    }
}