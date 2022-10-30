package ec.ug.oto.dao;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class FireBase {
    FirebaseDatabase database = FirebaseDatabase.getInstance();
    DatabaseReference myRef = database.getReference("message");

    public FireBase( ) {

    }
    public FireBase(FirebaseDatabase database) {
        this.database = database;
        myRef.setValue("Hello, World!");
    }
}
