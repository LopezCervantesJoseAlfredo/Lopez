# INTERFACES LISTENER Y SUS METODOS EN JAVA
##ActionListener :
<p>Se usa para detectar y manejar eventos de acción, osea, los que tienen lugar cuando se produce una acción sobre un elemento del programa.
<p>
METODOS :
<p>actionPerformed (ActionEvent)
</p>
## AdjustmentListener : 
<p>Para escuchar los eventos de tipo AdjustmentEvent producidos por la clase JScrollbar deberemos implementar la interfaz
<p> METODOS:
<p>adjustmentValueChanged(AdjustmentEvent)
</p>
## ComponentListener :
<p>Para marcar un objeto con la capacidad de escuchar eventos de tipo Component Event deberemos implementar la interfaz Component Listener . Los objetos que producen estos eventos son los JDialog y los JFrames
<p> METODOS:
<p>-componentHidden(ComponentEvent)
<p>-componentMoved(ComponentEvent)
<p>-componentResized(ComponentEvent)
<p>-componentShown(ComponentEvent)
</p>
## ContainerListener : 
<p>Eventos de contenedores son disparados por un contenedor sólo después de que un componente se añade o se retira del recipiente. Estos eventos son para la notificación solamente <p>- no escucha envase necesita estar presente para los componentes que se agregan o se quitan con éxito.
<p> METODOS:
<p>-ComponentAdded(ComponentEvent)
<p>-ComponentRemoved(ComponentEvent)
</p>
## FocusListener :
<p>Cuando un componente recibe el foco, es decir, es el elemento de la pantalla que estáactivo se producen eventos de tipo FocusEvent
<p> METODOS:
<p>focusGained(FocusEvent)
<p>focusLost(FocusEvent)
</p>
## ItemListener :
<p>Implementaremos esta interfaz para escuchar los eventos que pueden producir los objetos JCheckbox , JList y JCheckboxMenuItem.
<p> METODOS:
<p>itemStateChanged(ItemEvent)
</p>
## KeyListener : 
<p>Con la interfaz KeyListener se puede detectar y tratar los eventos generados por la pulsación de una tecla o por combinaciones de ellas, los KeyEvent
<p> METODOS:
<p>-keyPressed(KeyEvent)
<p>-keyReleased(KeyEvent)
<p>-keyTyped(KeyEvent)
</p>
## MouseListener : 
<p>Como su nombre indica esta interfaz nos permitirá escuchar los eventos de tipo MouseEvent , que son los producidos por el ratón al interaccionar con cualquiera de las clases Canvas , JDialog ,JFrame ,JPanel y JWindow
<p> METODOS:
<p>-mouseClicked(MouseEvent)
<p>-mouseEntered(MouseEvent)
<p>-mouseExited(MouseEvent)
<p>-mousePressed(MouseEvent)
<p>-mouseReleased(MouseEvent)
</p>
## MouseMotionListener : 
<p>Cualquiera de los objetos de las clases Canvas, JDialog, JFrame, JPaneL Y JWindow pueden producir eventos de este tipo
<p>-mouseDragged(MouseEvent)
<p>-mouseMoved(MouseEvent)
</p>
## WindowListener : 
<p>Implementaremos esta interfaz cuando queramos definir un objeto con capacidad para escuchar eventos de tipo WindowEvent
<p>-windowActivated(WindowEvent)
<p>-windowClosed(WindowEvent)
<p>-windowClosing(WindowEvent)
<p>-windowDeactivated(WindowEvent)
<p>-windowDeiconified(WindowEvent)
<p>-windowIconified(WindowEvent)
<p>-windowOpened(WindowEvent)
