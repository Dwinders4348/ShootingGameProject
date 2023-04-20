import java.awt.event.*;

public class CspMouseListener implements MouseListener {

    //
    // Field
    // 
    private ClayShootingPanel csp;
    
    // 
    // Constructor
    //
    public CspMouseListener(ClayShootingPanel csp) {
    
        this.csp = csp;
    }

    // 
    // Methods
    //
    public void mouseClicked(MouseEvent e) {
        csp.shoot(e.getX(), e.getY());
    }

    public void mouseEntered(MouseEvent e) {}
    public void mouseExited(MouseEvent e) {}
    public void mousePressed(MouseEvent e) {}
    public void mouseReleased(MouseEvent e) {}
}