//CODIGO CREADO POR JUAN RENÉ, SANTIAGO Y CRISTIAN
//EJEMPLO LINKEDLIST EN EL CURSO DE PROGRAMACIÓN II
//DERECHOS RESERVADOS :)
package SnakeExample;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.LinkedList;

import javax.swing.JFrame;

public class GameSnake extends JFrame implements Runnable, KeyListener {

    private LinkedList<Punto> lista = new LinkedList<Punto>();
    private int columna, fila; // Coordenadas de la serpiente
    private int colfruta, filfruta; // Coordenadas de la fruta
    private boolean activo = true; // Variable para finalizar el juego
    private Direccion direccion = Direccion.DERECHA;
    private Thread hilo;
    private int crecimiento = 0; // Indica cuantos cuadros se añaden a la serpiente
    private Image imagen; // Para evitar el parpadeo del repaint()
    private Graphics bufferGraphics;// Se dibuja en memoria para evitar parpadeo

    private enum Direccion {
        IZQUIERDA, DERECHA, SUBE, BAJA
    };

    class Punto {
        int x, y;

        public Punto(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public GameSnake() {
        // Entrada de las teclas de flechas
        this.addKeyListener(this);
        // La serpiente comienza con cuatro cuadraditos
        lista.add(new Punto(4, 25));
        lista.add(new Punto(3, 25));
        lista.add(new Punto(2, 25));
        lista.add(new Punto(1, 25));
        // Indicamos la ubicacion de la cabeza de la serpiente
        columna = 4;
        fila = 25;
        // Indicamos las coordenada de la fruta mediante un numero random
        colfruta = (int) (Math.random() * 50);
        filfruta = (int) (Math.random() * 50);
        // creamos el hilo y lo arrancamos (con esto se ejecuta el metodo run()
        hilo = new Thread(this);
        hilo.start();
    }

    @Override
    public void run() {
        while (activo) {
            try {
                // Dormimos el hilo para que la serpiente no se mueva rapidamente
                Thread.sleep(100);
                // Movimiento de la serpiente según las flechas precionadas
                switch (direccion) {
                case DERECHA:
                    columna++;
                    break;
                case IZQUIERDA:
                    columna--;
                    break;
                case SUBE:
                    fila--;
                    break;
                case BAJA:
                    fila++;
                    break;
                }

                repaint();
                sePisa();
                // insertamos la coordenada de la cabeza de la serpiente en la lista
                lista.addFirst(new Punto(columna, fila));

                if (this.verificarComeFruta() == false && this.crecimiento == 0) {
                    // si no estamos en la coordenada de la fruta y no debe crecer la serpiente
                    // borramos el ultimo nodo de la lista
                    // esto hace que la lista siga teniendo la misma cantidad de nodos
                    lista.remove(lista.size() - 1);
                } else {
                    // Si crecimiento es mayor a cero la serpiente crece
                    if (this.crecimiento > 0)
                        this.crecimiento--;
                }
                verificarFin();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    // Verificamos si la cabeza de la vibora se encuentra dentro de su cuerpo (Colision)
    private void sePisa() {
        for (Punto p : lista) {
            if (p.x == columna && p.y == fila) {
                activo = false;
                setTitle("Game Over"); //Mensaje a mostrar cuando se finaliza el juego
            }
        }
    }

    // Verificamos si estamos fuera del area de juego (Dentro del cuadro)
    private void verificarFin() {
        if (columna < 0 || columna >= 50 || fila < 0 || fila >= 50) {
            activo = false;
            setTitle("Game Over"); //Mensaje a mostrar cuando se finaliza el juego
        }
    }
    
    // Verificacion si la serpiente ha comido la fruta

    private boolean verificarComeFruta() {
        if (columna == colfruta && fila == filfruta) {
            colfruta = (int) (Math.random() * 50); //Se generan nuevas coordenadas de la fruta
            filfruta = (int) (Math.random() * 50); //Se generan nuevas coordenadas de la fruta
            this.crecimiento = 10; // Cantidad de cuadros de cuanto crece la serpiente
            return true;
        } else
            return false;
    }

    // Dentro de la ventana del juego (Contenido)
    public void paint(Graphics g) {
        super.paint(g);
        if (!lista.isEmpty()) {
            if (imagen == null) {
                imagen = createImage(this.getSize().width, this.getSize().height);
                bufferGraphics = imagen.getGraphics();
            }
            // Se borra la imagen de memoria
            bufferGraphics.clearRect(0, 0, getSize().width, getSize().width);
            // Dibujar el recuadro
            bufferGraphics.setColor(Color.red);
            bufferGraphics.drawRect(20, 50, 500, 500);
            // Dibujar la serpiente
            for (Punto punto : lista) {
                bufferGraphics.fillRect(punto.x * 10 + 20, 50 + punto.y * 10, 8, 8);
            }
            // Dibujar la fruta
            bufferGraphics.setColor(Color.blue);
            bufferGraphics.fillRect(colfruta * 10 + 20, filfruta * 10 + 50, 8, 8);
            g.drawImage(imagen, 0, 0, this);
        }
    }

    public void keyPressed(KeyEvent arg0) {
        if (arg0.getKeyCode() == KeyEvent.VK_RIGHT) {
            direccion = Direccion.DERECHA;
        }
        if (arg0.getKeyCode() == KeyEvent.VK_LEFT) {
            direccion = Direccion.IZQUIERDA;
        }
        if (arg0.getKeyCode() == KeyEvent.VK_UP) {
            direccion = Direccion.SUBE;
        }
        if (arg0.getKeyCode() == KeyEvent.VK_DOWN) {
            direccion = Direccion.BAJA;
        }
    }

    public void keyReleased(KeyEvent arg0) {
    }

    public void keyTyped(KeyEvent arg0) {
    }

    public static void main(String[] args) {
    	// Creacion de la ventana y del tamaño
        GameSnake f = new GameSnake();
        f.setSize(600, 600);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Boton de cerrar la ventana
    }

}