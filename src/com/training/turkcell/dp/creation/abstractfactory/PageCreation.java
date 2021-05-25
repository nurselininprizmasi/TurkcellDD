package com.training.turkcell.dp.creation.abstractfactory;

public class PageCreation {
    public void createPage(final int themeType) {
        IButtonRender buttonRender = ButtonFactory.createButtonRender(themeType);
        ILabelRender iLabelRender = LabelFactory.createLabelRender(themeType);
        buttonRender.render();
        iLabelRender.render();

        IRender renderLoc = RenderFactory.createRender(themeType);
        renderLoc.buttonRender().render();
        renderLoc.labelRender().render();
    }

}
