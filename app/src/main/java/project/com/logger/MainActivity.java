package project.com.logger;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String s="{\"message\":\"Comments fetched successfully\",\"status\":1,\"data\":{\"nextCursor\":\"\",\"comments\":[{\"id\":\"160\",\"timeStamp\":\"2015-08-08 12:00:18\",\"parentCommentId\":\"323223\",\"imageUrl\":\"qa/userImages/thgqaexg4pwezmtstned\",\"userId\":\"246\",\"fameName\":\"Asif\",\"comment\":\"lazy one\"},{\"id\":\"161\",\"timeStamp\":\"2015-08-08 12:00:18\",\"parentCommentId\":\"323223\",\"imageUrl\":\"qa/userImages/thgqaexg4pwezmtstned\",\"userId\":\"246\",\"fameName\":\"Asif\",\"comment\":\"lazy one\"},{\"id\":\"162\",\"timeStamp\":\"2015-08-08 12:00:18\",\"parentCommentId\":\"323223\",\"imageUrl\":\"qa/userImages/thgqaexg4pwezmtstned\",\"userId\":\"246\",\"fameName\":\"Asif\",\"comment\":\"lazy one\"},{\"id\":\"172\",\"timeStamp\":\"2015-09-14 06:32:59\",\"parentCommentId\":\"323223\",\"imageUrl\":\"qa/userImages/sglxvgvnjgi9hhlzic7g\",\"userId\":\"194\",\"fameName\":\"Go_Go_G0\",\"comment\":\"comment\"},{\"id\":\"532\",\"timeStamp\":\"2015-09-15 11:57:46\",\"parentCommentId\":\"323223\",\"imageUrl\":\"jpg/weoxogwgvink5cagvn68\",\"userId\":\"1\",\"fameName\":\"admin.famelive\",\"comment\":\"faayedeeeeee or fasle\"}]},\"code\":108}";
        Logger.json("Hi",s);
    }
}
