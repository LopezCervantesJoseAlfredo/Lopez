# JAVA
<b> Qué es un hilo en Java ? : </b>
<p>Los hilos son otra forma de crear la posibilidad de concurrencia de actividades; sin embargo, la gran diferencia es que los hilos comparten el código y el acceso a algunos datos en forma similar a como un objeto tiene acceso a otros objetos. En Java un hilo es un objeto con capacidad de correr en forma concurrente el método run(). <p>
<p>Existen dos formas de implementar hilos en Java:<p>

<p>1) Extendiendo de la clase java.lang.Thread<p>

<p>2) Implementando la interface java.lang.Runnable<p>

<p>Antes de entrar en detalles sobre cómo implementar una opción o la otra, sería pertinente saber cuando debemos usar un Thread en Java. Un hilo o thread en Java lo usaremos en caso de que queramos que una funcionalidad (parte del código) de nuestro programa se ejecute en paralelo al proceso principal, así pues, dicho código lo colocaríamos dentro del método run() de la clase Thread o la interface Runnable para que se cumpla dicho cometido.<p>

<p>Como tal, el método público run() se define en la interface Runnable, y como la clase Thread implementa dicha interface, hereda automáticamente éste método.<p>

<p>Teniendo en cuenta de que contamos con dos formas de implementar un Thread en Java, una pregunta que tal vez puede surgirnos es saber cuál de las dos es mejor: extendiendo de la clase Thread o implementando la interface Runnable.<p>

<p>Por cuestiones de diseño, considero que la mejor forma es implementando la interface Runnable, ya que si tenemos en cuenta de que en Java sólo podemos extender de una sola clase, si extendemos de la clase Thread, ya no podríamos hacerlo de alguna otra clase, mientras que implementando la interface Runnable, podremos implementar otra interface en cualquier momento que necesitemos.<p>

<p>Además, tengamos en cuenta que según la Programación Orientada a Objetos, el propósito de extender una clase es proporcionar alguna característica o funcionalidad nueva, así que si nuestro propósito es simplemente usar el método run(), el cual usaremos solamente para definir qué parte de nuestro código se ejecutará en otro hilo, la opción más razonable sería implementar la interface Runnable.<p>

<p>Así que después de decidir de qué forma se creará el Thread en java, lo siguiente que debemos hacer es crear el objeto de nuestro thread e iniciar el sub-proceso. Esto creará una ruta de ejecución separada paralela al hilo principal de la aplicación.<p>

<p>Un thread en java está basado en estados, así que cuando se crea un objeto de la clase del thread que definimos extendiendo de la clase Thread o implementando de la interface Runnable, éste solamente se crea con un estado predefinido, pero no se iniciará hasta que se llame al método start() de la clase java.lang.Thread.

Entonces, cuando creamos el objeto del thread en java, éste quedará en un estado New, y al llamar al método start(), la Máquina Virtual de Java ejecuta el método run() de la clase que definimos, lo que hace que el thread pase al estado Runnable. A partir de aquí, sera el planificador de Threads el encargado de asignar CPU a este sub-proceso (hilo).

Ya después de esto, el thread puede pasar a estado Terminated o quedar en estado Waiting, Time Waiting o Blocked. Veamos el código:<p>

<b> Ejemplo de implementación de un Thread en Java </b>

![R](https://i.ytimg.com/vi/hHtx-4NFFR0/maxresdefault.jpg)

<b>Implementación de Runnable </b>
<p>Es la forma más sencilla de crear un hilo implementando Runnable. Se puede crear un hilo en cualquier objeto implementando Runnable. Para implementar un Runnable, uno solo tiene que implementar el método de ejecución.<p>

<p>public void run ()<p>

<p>En este método, tenemos el código que queremos ejecutar en un hilo concurrente. En este método, podemos usar variables, instanciar clases y realizar una acción como lo hace el hilo principal. El hilo permanece hasta el regreso de este método. El método de ejecución establece un punto de entrada a un nuevo hilo.<p>

<p>Cómo crear un hilo usando la interfaz Runnable<p>
<p>Para crear un hilo usando ejecutable, use el siguiente código:<p>

<p>Ejecutable ejecutable = new MyRunnable ();<p>
  
<p>Subproceso subproceso = nuevo subproceso (ejecutable);<p>
<p>thread.start ();<p>
<p>El hilo ejecutará el código que se menciona en el método run () del objeto Runnable pasado en su argumento.<p>

<b>Un ejemplo de hilo simple usando ejecutable </b>
<p>public class ExampleClass implements Runnable {  <p> 
  <p>  @Override  <p>
  <p>  public void run() {  <p>
  <p>      System.out.println("Thread has ended");  <p>
  <p>  }  
   <p> public static void main(String[] args) {<p> 
    <p>    ExampleClass ex = new ExampleClass();  <p>
    <p>    Thread t1= new Thread(ex);  <p>
    <p>    t1.start();  <p>
    <p>    System.out.println("Hi"); <p> 
 <p>   }  <p>
<p>}<p>  

<p>SALIDA DE CODIGO<P>
<p> Hi <p>
<p> Thread has ended <p>
