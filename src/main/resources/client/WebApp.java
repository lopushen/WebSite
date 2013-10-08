package client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.*;

public class WebApp implements EntryPoint {
    public void onModuleLoad() {
        Label label = new Label();
        label.setText("Hello World!");
        RootPanel.get().add(label);
    }
}
