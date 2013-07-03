package sk.tomsik68.mclauncher.impl.login.legacy;

import sk.tomsik68.mclauncher.api.login.IProfile;

public class MinecraftProfile implements IProfile {

    private String pass;
    private String name;

    public MinecraftProfile(String username, String password) {
        name = username;
        pass = password;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getPassword() {
        return pass;
    }

    @Override
    public boolean isRemember() {
        return pass.length() > 0;
    }

    @Override
    public String getToken() {
        return "";
    }

}