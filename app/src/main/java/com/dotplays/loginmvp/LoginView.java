package com.dotplays.loginmvp;

public interface LoginView {

    void loginFail();

    void loginSuccessful();

    void navigateHome();

    void setErrorUsername();

    void setErrorPassword();
}
