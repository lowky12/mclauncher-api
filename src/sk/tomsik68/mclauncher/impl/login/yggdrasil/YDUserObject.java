package sk.tomsik68.mclauncher.impl.login.yggdrasil;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import net.minidev.json.JSONArray;
import net.minidev.json.JSONObject;

public class YDUserObject {

    public final String id;
    private final ArrayList<Prop> props = new ArrayList<Prop>();

    public YDUserObject(JSONObject object) {
        id = object.get("id").toString();
        JSONArray propsArray = (JSONArray) object.get("properties");
        for (Object obj : propsArray) {
            JSONObject jsonObj = (JSONObject) obj;
            Prop p = new Prop();
            p.name = jsonObj.get("name").toString();
            p.value = jsonObj.get("value").toString();
            props.add(p);
        }
    }


    public YDUserObject(String id) {
        this.id = id;
    }


    public List<Prop> getProperties() {
        return Collections.unmodifiableList(props);
    }

    public class Prop {
        public String name, value;
    }
}
