package br.com.aliexpress.steps;

import br.com.aliexpress.utils.Browser;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class BaseSteps extends Browser {


    @Before
    public void abrirNavegador(){
        browserUp("https://pt.aliexpress.com/");
    }

    @After
    public void fecharNavegador(){
        browserDown();
    }

}

