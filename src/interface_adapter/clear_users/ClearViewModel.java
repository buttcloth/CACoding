package interface_adapter.clear_users;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

import interface_adapter.ViewModel;

public class ClearViewModel extends ViewModel {

    public static final String CLEAR_BUTTON_LABEL = "Clear";

    private ClearState state = new ClearState();

    public ClearViewModel() {
        super("Clear");
    }

    public void setState(ClearState state) {
        this.state = state;
    }

    public ClearState getState() {
        return state;
    }

    private final PropertyChangeSupport support = new PropertyChangeSupport(this);

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        support.addPropertyChangeListener(listener);
    }

    public void firePropertyChanged() {
        support.firePropertyChange("state", null, this.state);
    }
}
