package com.example.a13522.litepaldem;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import org.litepal.crud.DataSupport;
import org.litepal.tablemanager.Connector;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       Button create = (Button) findViewById(R.id.create_database);
        create.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Connector.getDatabase();//创建数据库

                Book book = new Book();
                book.setName("Tpom");
                book.setId(110);
                book.setAuthor("Dan Brown");
                book.setPages(456);
                book.setPrice(15.9);

                book.setName("bbbbbb");
                book.setId(12345);
                book.setAuthor("ccccc");
                book.setPages(8888);
                book.setPrice(9.9);
                book.save();
            }
        });

       Button updata= (Button) findViewById(R.id.updatae_database);
        updata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Book book = new Book();
                book.setId(119);
                book.setAuthor("aasaasasasas");
                book.updateAll("name = ? and author =?","Tpom","Dan Brown");
            }
        });

       Button delect = (Button) findViewById(R.id.delect_database);
        delect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DataSupport.deleteAll(Book.class,"price<?","10");
            }
        });

       Button find = (Button) findViewById(R.id.find_database);
        find.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              List<Book> books= DataSupport.findAll(Book.class);
                for (Book book:books){
                    Log.d("bbb",book.getName());
                    Log.d("bbb",book.getAuthor());
                    Log.d("bbb", String.valueOf(book.getId()));
                    Log.d("bbb", String.valueOf(book.getPages()));
                    Log.d("bbb", String.valueOf(book.getPrice()));

                }
            }
        });
    }
}
