package queue;

// Classe che implementa una coda (FIFO) utilizzando un array circolare
public class Queue {
    private int[] queue = new int[5]; // Array fisso di dimensione 5 per contenere la coda
    private int size; // Numero attuale di elementi nella coda
    private int front; // Indice dell'inizio della coda
    private int rear; // Indice della fine della coda (prossima posizione disponibile)

    // Metodo per inserire un elemento nella coda
    public void enQueue(int data) {
        if (!isFull()) { // Verifica se la coda non è piena
            this.queue[this.rear] = data; // Inserisce il dato in posizione rear
            this.rear = (this.rear + 1) % 5; // Incrementa rear con comportamento circolare
            this.size += 1; // Aumenta la dimensione logica della coda
        } else {
            System.out.println("Queue is full"); // Messaggio se la coda è piena
        }
    }

    // Metodo per stampare gli elementi nella coda
    public void show() {
        System.out.println("Elements: ");
        for (int i = 0; i < size; i++) {
            // Stampa gli elementi in ordine FIFO, gestendo l'array circolare
            System.out.println(this.queue[(this.front + i) % 5] + " ");
        }
        System.out.println();

        // Stampa l'intero array interno (per debugging)
        for (int n : this.queue) {
            System.out.println(n + " ");
        }
    }

    // Metodo per rimuovere un elemento dalla coda
    public int deQueue() {
        int data = this.queue[this.front]; // Preleva l'elemento in testa
        if (!isEmpty()) { // Verifica se la coda non è vuota
            this.front = (this.front + 1) % 5; // Incrementa front con comportamento circolare
            this.size -= 1; // Riduce la dimensione
        } else {
            System.out.println("Queue is empty"); // Messaggio se la coda è vuota
        }

        return data; // Restituisce l'elemento rimosso
    }

    // Verifica se la coda è vuota
    public boolean isEmpty() {
        return this.size == 0;
    }

    // Verifica se la coda è piena
    public boolean isFull() {
        return this.size == 5;
    }

    // Getter per ottenere l’array interno della coda
    public int[] getQueue() {
        return this.queue;
    }

    // Setter per impostare un nuovo array per la coda
    public void setQueue(int[] queue) {
        this.queue = queue;
    }

    // Getter per la dimensione attuale
    public int getSize() {
        return this.size;
    }

    // Setter per la dimensione (attenzione: usare con cautela)
    public void setSize(int size) {
        this.size = size;
    }

    // Getter per l’indice front
    public int getFront() {
        return this.front;
    }

    // Setter per l’indice front (attenzione: usare con cautela)
    public void setFront(int front) {
        this.front = front;
    }

    // Getter per l’indice rear
    public int getRear() {
        return this.rear;
    }

    // Setter per l’indice rear (attenzione: usare con cautela)
    public void setRear(int rear) {
        this.rear = rear;
    }
}
