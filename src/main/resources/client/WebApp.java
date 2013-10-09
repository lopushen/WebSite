package client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.safehtml.shared.SafeHtml;
import com.google.gwt.safehtml.shared.SimpleHtmlSanitizer;
import com.google.gwt.user.client.DOM;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.*;
import com.google.gwt.user.client.Element;


public class WebApp implements EntryPoint {
    public void onModuleLoad() {
        Label label = new Label();
        label.setText("Hello World!");
        RootPanel.get().add(label);
        SimplePanel holder = new SimplePanel();
        Button button = new Button("Start");
        button.getElement().setId("but1");
        holder.add(button);
        button.addClickHandler(new ClickHandler() {
            @Override
            public void onClick(ClickEvent clickEvent) {
                Window.alert("HOHOH");
            }
        });
        RootPanel.get().add(holder);
        label.setText(getContent("but1"));
    }

    private void setUpGui() {
    }

    private String getContent(String id) {
        String toReturn = "";
        Element element = DOM.getElementById(id);
        if (element != null) {
            toReturn = DOM.getInnerHTML(element);
            SafeHtml safeHtml = SimpleHtmlSanitizer.sanitizeHtml(toReturn);
            toReturn = safeHtml.asString();
        } else {
            toReturn = "Unable to find "+ id + " content in HTML page";
        }
        return toReturn;
    }
}
