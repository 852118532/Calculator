package jack.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import java.lang.Integer;

public class MainActivity extends AppCompatActivity {
    
    private Button Zero;
    private Button One;
    private Button Two;
    private Button Three;
    private Button Four;
    private Button Five;
    private Button Six;
    private Button Seven;
    private Button Eight;
    private Button Nine;
    private Button Dot;
    private Button Equal;
    private Button Add;
    private Button Sub;
    private Button Mul;
    private Button Div;
    private Button AC;
    private Button CE;
    private TextView NO10;     //十进制结果显示窗口
    private TextView NO2;      //二进制结果显示窗口
    private TextView NO16;     //十六进制结果显示窗口
    String num1="";         //操作的第二个数字
    String num2="";         //操作的第一个数字
    double num3=0;        //算数计算的结果
    String numA="";        //2进制结果，用字符串表示
    String numB="";        //16进制结果，用字符串表示
    String result="";      //计算结果，用字符串表示
    String sign = null;    //用于标记当前进行的算数操作
    int mark=0;            //用于判断当前操作的数字
    boolean flag=true;           //用于判断是否输入操作符   true未输入  false已输入
    boolean dotmark=true;       //用于判断是否输入小数点    true未输入  false已输入

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Zero=(Button)findViewById(R.id.button_0);                 //0
        One=(Button)findViewById(R.id.button_1);                  //1
        Two=(Button)findViewById(R.id.button_2);                  //2
        Three=(Button)findViewById(R.id.button_3);                //3
        Four=(Button)findViewById(R.id.button_4);                 //4
        Five=(Button)findViewById(R.id.button_5);                 //5
        Six=(Button)findViewById(R.id.button_6);                  //6
        Seven=(Button)findViewById(R.id.button_7);                //7
        Eight=(Button)findViewById(R.id.button_8);                //8
        Nine=(Button)findViewById(R.id.button_9);                 //9
        Dot=(Button)findViewById(R.id.button10);                  //. dot
        Equal=(Button)findViewById(R.id.button11);                //= 求和
        Add=(Button)findViewById(R.id.button12);                  //+ 加法
        Sub=(Button)findViewById(R.id.button13);                  //- 减法
        Mul=(Button)findViewById(R.id.button14);                  //X 乘法
        Div=(Button)findViewById(R.id.button15);                  /// 除法
        AC=(Button)findViewById(R.id.button17);                   //全清
        CE=(Button)findViewById(R.id.button18);                 //回退
        NO10=(TextView)findViewById(R.id.ten);
        NO2=(TextView)findViewById(R.id.two);
        NO16=(TextView)findViewById(R.id.sixteen);

        Zero.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mark==0){
                    if(num1.equals("0")){
                        num1="0";
                    }else {
                        num1 = num1 + "0";
                    }
                    NO10.setText(num1);
                }else if(mark==1){
                    if (num2.equals("0")){
                        num2="0";
                    }else {
                        num2 = num2 + "0";
                    }
                    NO10.setText(num1 + sign + num2);
                }else{
                    num1 = String.valueOf(num3);
                    if(num2.equals("0")){
                        num2="0";
                    }
                    else {
                        num2 = num2 + "0";
                    }
                    NO10.setText(num1 + sign + num2);
                }
            }
        });
        One.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mark==0){
                    num1=num1+"1";
                    NO10.setText(num1);
                }else if(mark==1){
                    num2=num2+"1";
                    NO10.setText(num1+sign+num2);
                }else{
                    num1 = String.valueOf(num3);
                    num2 = num2 + "1";
                    NO10.setText(num1 + sign + num2);
                }
            }
        });
        Two.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mark==0){
                    num1=num1+"2";
                    NO10.setText(num1);
                }else if(mark==1){
                    num2=num2+"2";
                    NO10.setText(num1+sign+num2);
                }else{
                    num1 = String.valueOf(num3);
                    num2 = num2 + "2";
                    NO10.setText(num1 + sign + num2);
                }
            }
        });
        Three.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mark==0){
                    num1=num1+"3";
                    NO10.setText(num1);
                }else if(mark==1){
                    num2=num2+"3";
                    NO10.setText(num1+sign+num2);
                }else{
                    num1 = String.valueOf(num3);
                    num2 = num2 + "3";
                    NO10.setText(num1 + sign + num2);
                }
            }
        });
        Four.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mark==0){
                    num1=num1+"4";
                    NO10.setText(num1);
                }else if(mark==1){
                    num2=num2+"4";
                    NO10.setText(num1+sign+num2);
                }else{
                    num1 = String.valueOf(num3);
                    num2 = num2 + "4";
                    NO10.setText(num1 + sign + num2);
                }
            }
        });
        Five.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mark==0){
                    num1=num1+"5";
                    NO10.setText(num1);
                }else if(mark==1){
                    num2=num2+"5";
                    NO10.setText(num1+sign+num2);
                }else{
                    num1 = String.valueOf(num3);
                    num2 = num2 + "5";
                    NO10.setText(num1 + sign + num2);
                }
            }
        });
        Six.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mark==0){
                    num1=num1+"6";
                    NO10.setText(num1);
                }else if(mark==1){
                    num2=num2+"6";
                    NO10.setText(num1+sign+num2);
                }else{
                    num1 = String.valueOf(num3);
                    num2 = num2 + "6";
                    NO10.setText(num1 + sign + num2);
                }
            }
        });
        Seven.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mark==0){
                    num1=num1+"7";
                    NO10.setText(num1);
                }else if(mark==1){
                    num2=num2+"7";
                    NO10.setText(num1+sign+num2);
                }else{
                    num1 = String.valueOf(num3);
                    num2 = num2 + "7";
                    NO10.setText(num1 + sign + num2);
                }
            }
        });
        Eight.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mark==0){
                    num1=num1+"8";
                    NO10.setText(num1);
                }else if(mark==1){
                    num2=num2+"8";
                    NO10.setText(num1+sign+num2);
                }else{
                    num1 = String.valueOf(num3);
                    num2 = num2 + "8";
                    NO10.setText(num1 + sign + num2);
                }
            }
        });
        Nine.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mark==0){
                    num1=num1+"9";
                    NO10.setText(num1);
                }else if(mark==1){
                    num2=num2+"9";
                    NO10.setText(num1+sign+num2);
                }else{
                    num1 = String.valueOf(num3);
                    num2 = num2 + "9";
                    NO10.setText(num1 + sign + num2);
                }
            }
        });
        Add.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if(flag){
                    sign = "+";
                    mark++;
                    flag = false;
                    dotmark=true;
                }
            }
        });
        Sub.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if(flag){
                    sign="-";
                    mark++;
                    flag=false;
                    dotmark=true;
                }
            }
        });
        Mul.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if(flag){
                    sign="*";
                    mark++;
                    flag=false;
                    dotmark=true;
                }
            }
        });
        Div.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if(flag){
                    sign="÷";
                    mark++;
                    flag=false;
                    dotmark=true;
                }
            }
        });
        Dot.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if(dotmark){
                    if(mark==0) {
                        num1 = num1 + ".";
                        NO10.setText(num1);
                    }else if(mark==1){
                        num2=num2+".";
                        NO10.setText(num1+sign+num2);
                    }else{
                        num1 = String.valueOf(num3);
                        num2 = num2 + ".";
                        NO10.setText(num1+sign+num2);
                    }
                    dotmark=false;
                }
            }
        });
        AC.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = "";
                num2 = "";
                num3 = 0;
                mark = 0;
                sign = "";
                NO10.setText("0");
                flag = true;
                dotmark = true;
                numA="";
                numB="";
                NO2.setText("");
                NO16.setText("");
            }
        });
        CE.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mark==0){
                    num1="";
                    NO10.setText(num1);
                }else if(mark==1){
                    num2="";
                    NO10.setText(num1+sign+num2);
                }else{
                    num1 = String.valueOf(num3);
                    num2 = "";
                    NO10.setText(num1 + sign + num2);
                }
            }
        });
        Equal.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                flag = true;
                dotmark = true;
                if (sign.equals("+")) {
                    double x = Double.parseDouble(num1);
                    double y = Double.parseDouble(num2);
                    num3 = x + y;
                    numA = Integer.toBinaryString((int) num3);
                    numB = Integer.toHexString((int) num3);
                    result = String.valueOf(num3);
                    NO10.setText(num1 + sign + num2 + "=" + result);
                    NO2.setText("二进制结果为" + numA);
                    NO16.setText("十六进制结果为" + numB);
                    num2 = "";
                } else if (sign.equals("-")) {
                    double x = Double.parseDouble(num1);
                    double y = Double.parseDouble(num2);
                    num3 = x - y;
                    numA = Integer.toBinaryString((int) num3);
                    numB = Integer.toHexString((int) num3);
                    result = String.valueOf(num3);
                    NO10.setText(num1 + sign + num2 + "=" + result);
                    NO2.setText("二进制结果为" + numA);
                    NO16.setText("十六进制结果为" + numB);
                    num2 = "";
                } else if (sign.equals("*")) {
                    double x = Double.parseDouble(num1);
                    double y = Double.parseDouble(num2);
                    num3 = x * y;
                    numA = Integer.toBinaryString((int) num3);
                    numB = Integer.toHexString((int) num3);
                    result = String.valueOf(num3);
                    NO10.setText(num1 + sign + num2 + "=" + result);
                    NO2.setText("二进制结果为" + numA);
                    NO16.setText("十六进制结果为" + numB);
                    num2 = "";
                } else if (sign.equals("÷")) {
                    double x = Double.parseDouble(num1);
                    double y = Double.parseDouble(num2);
                    if (y == 0) {
                        NO10.setText("ERROR");
                        num1 = "";
                        num2 = "";
                        num3 = 0;
                        mark = 0;
                        sign = "";
                        flag = true;
                        dotmark = true;
                        numA = "";
                        numB = "";
                    } else {
                        num3 = x / y;
                        numA = Integer.toBinaryString((int) num3);
                        numB = Integer.toHexString((int) num3);
                        result = String.valueOf(num3);
                        NO10.setText(num1 + sign + num2 + "=" + result);
                        NO2.setText("二进制结果为" + numA);
                        NO16.setText("十六进制结果为" + numB);
                        num2 = "";
                    }
                }
            }
        });
    }
}
