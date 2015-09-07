package android.foodme.ncr.project.main.menu.data;

/**
 * Created by kitaemyoung on 7/24/15.
 */
public class MenuItem {

    private long id;
    private String name;

    public MenuItem(long id, String name){
        this.id = id;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString(){
        StringBuilder st = new StringBuilder();
        st.append("ItemId: ");
        st.append(id);
        st.append("Item: ");
        st.append(name);
        return st.toString();
    }

}
