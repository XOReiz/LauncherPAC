package io.github.confuser2188.launcherpac.design.tab;

import io.github.confuser2188.launcherpac.design.component.Line;
import io.github.confuser2188.launcherpac.design.component.Text;
import io.github.confuser2188.launcherpac.design.component.TextBox;
import io.github.confuser2188.launcherpac.design.frame.MainMenu;

import java.awt.*;
import java.awt.event.KeyEvent;

public class AccountSettings extends Tab {

    public AccountSettings() {
        super(5);
    }

    @Override
    public void load() {
        add(new Text("Account", 350, 225, new Font("Arial", Font.PLAIN, 16), Color.WHITE));
        add(new Line(350, 240, 700, 240, Color.GRAY));

        add(new Text("Username:", 350, 285, new Font("Arial", Font.PLAIN, 16), Color.WHITE));
        add(new TextBox(MainMenu.USERNAME, 440, 270, 150, 16){
            @Override
            public void dispatchKeyEvent(KeyEvent e) {
                super.dispatchKeyEvent(e);

                MainMenu.USERNAME = this.text;
            }
        });
    }
}