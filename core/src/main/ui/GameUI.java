package ui;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.badlogic.gdx.scenes.scene2d.ui.Touchpad;

import input.IPlayerInput;
import input.PlayerInput;

public class GameUI {

    private final Stage stage;
    private final Table table;
    private final Skin skin;
    private Touchpad movementTouchpad;
    private ImageTextButton shootButton;
    private Label label;

    private final PlayerInput playerInput = new PlayerInput();

    public GameUI() {
        this.stage = new Stage();
        Gdx.input.setInputProcessor(stage);
        this.table = new Table();
        table.setFillParent(true);
        stage.addActor(table);
        table.setDebug(true);
        skin = new Skin(Gdx.files.internal("skins/biological-attack/skin/biological-attack-ui.json"));
    }

    public void setDebugText(String text) {
        label.setText(text);
    }

    public void build() {
        label = new Label("", skin);
        table.add(label).width(400).height(200).expand().top().padTop(50).row();

        movementTouchpad = new Touchpad(20, skin);
        table.add(movementTouchpad).width(400).height(400).expand().left().bottom().padLeft(50).padBottom(50);

        shootButton = new ImageTextButton(null, skin);
        table.add(shootButton).width(200).height(200).expand().right().bottom().padRight(100).padBottom(100);
    }

    public void readInput() {
        playerInput.setX(movementTouchpad.getKnobPercentX());
        playerInput.setY(movementTouchpad.getKnobPercentY());
        playerInput.setShootPressed(shootButton.isPressed());
    }

    public void render(float delta) {
        stage.act(delta);
        stage.draw();
    }

    public void resize(int width, int height) {
        stage.getViewport().update(width, height, true);
    }

    public void dispose() {
        stage.dispose();
    }

    public IPlayerInput getPlayerInput() {
        return playerInput;
    }

}
