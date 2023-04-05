package lsp.voilation;

public class Courses {
    public void htmlCssJavaScript(){
        // code to buy html,css,js
    }
    public void react(){
        // code to buy react
    }
    public void pythonForWebDevelopment(){
        // code to buy python
    }
    public void pythonForMachineLearning(){
        // code for machine learning
    }
}
class Python extends Courses{

}
// in the above python course doesn't contain the html,css and react like courses which violates liskov substitution principal.
