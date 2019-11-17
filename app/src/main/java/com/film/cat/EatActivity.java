package com.film.cat;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.film.cat.model.SimpleItem;

import java.util.ArrayList;

public class EatActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private ArrayList<SimpleItem> mDataItem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eat);

        data();

        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getBaseContext()));
        mRecyclerView.setAdapter(new CustomAdapter());
    }

    private void data() {
        mDataItem = new ArrayList<SimpleItem>();
        mDataItem.add(new SimpleItem("มาทำความเข้าใจพฤติกรรมการกินอาหารของน้องแมวกันดีกว่า",
                "\n ก่อนที่เราจะ ังเกตได้ว่า พฤติกรรมแมวของเรา ั้นมีการทานอาหารที่เปลี่ยนแปลงไปยังบ้าง ขั้นแรกเราต้องรู้เสียก่อนว่าโดยปกติแล้วน้องเหมียวของเรานั้นมีรูปแบบการกินอาหารอย่างไร หากวันไหนที่เพื่อนๆ มีเวลาอยู่บ้าน ั้งวัน เวลาให้อาหารน้องแมวแนะนำให้ลองสังเกตและอย่าลืมจดบันทึกข้อสังเกตเหล่านี้เก็บเอาไว้อ้างอิงด้วยนะคะ\n" +
                            "\n •\tลักษณะการกิน : แมวของเรากินอย่างรวดเร็ว หรือค่อยๆ ละเลียดกินช้าๆ\n" +
                            "\n •\tปริมาณ : ดูว่าในแต่ละวันเค้าทานอาหารจนหมด หรือมีอาหารเหลือเอาไว้\n" +
                            "\n •\tวิธีกิน : น้องเหมียวกินอาหารครั้งละเยอะๆ หรือค่อยๆ ทานไปเรื่อยๆ ตลอดวัน เมื่อเราทราบรูปแบบพฤติกรรมแมวของเราแล้ว คราวนี้เราจะสามารถตามดูการเปลี่ยนแปลงต่างๆ ที่อาจจะเป็นสัญญาณของความผิดปกติบางอย่างได้แล้วล่ะค่ะ\n" +
                            "\n"));

        mDataItem.add(new SimpleItem("สัญญาณของการกินอาหารแมวอย่างมีสุขภาพดีเป็นอย่างไรนะ?",
                "\n หลังจากที่รู้ว่าน้องแมวของเรามีนิสัยการทานอาหารยังไงแล้ว ทีนี้ก็ได้เวลาเช็กแล้วค่ะ ว่าพฤติกรรมการทานอาหารของน้องเหมียวของเราเป็นแบบนี้บ้างหรือเปล่า\n" +
                            "\n •\tมากินทันทีที่เราเทอาหารแมวลงในชามของเค้า\n" +
                            "\n •\tตื่นตัวกับเรื่องกิน ตื่นเต้นที่จะได้อาหาร\n" +
                            "\n •\tมีเวลาและจำนวนครั้งในการกินที่คงเส้นคงวา\n" +
                            "\n •\tกินอาหารในปริมาณคงที่หรือเปล่า\n" +
                        "\n ถ้าน้องแมวของเพื่อนๆ มีสัญญาณการกินดังนี้ ก็ขอแสดงความยินดีด้วยค่ะ เพราะน้องแมวของเพื่อนๆ ยังมีความสุขกับการกินอาหารซึ่งเป็นสัญญาณของการกินอย่างมีสุขภาพที่ดี ไม่มีปัญหาอะไร แต่ถ้าพบว่าเค้าเริ่มมีพฤติกรรมที่เปลี่ยนไป เช่นเริ่มทานเร็วขึ้น ทานมากขึ้น กลายเป็นแมวกินน้อยเกินไป เลือกกินอาหาร หรือกลายเป็นแมวเบื่ออาหารไม่ยอมทานอะไรเลยตลอดทั้งวัน นั่นคือพฤติกรรมที่เริ่มส่งสัญญาณมาแล้วค่ะว่าสุขภาพแมวกำลังมีปัญหา\n" +
                        "\n"));

        mDataItem.add(new SimpleItem("การสังเกตว่าน้องแมวดื่มน้ำอย่างไร ก็ถือเป็นการตรวจสอบสัญญาณสุขภาพที่สำคัญนะ",
                "\n สำหรับน้องแมวนั้นการดื่มน้ำก็มีความสำคัญไม่น้อยไปกว่าการทานอาหารเลยค่ะ เนื่องจากน้องแมวของเราของเราจำเป็นจะต้องได้รับน้ำในปริมาณที่เหมาะสมเพื่อให้สุขภาพแข็งแรง ไม่มีปัญหาเรื่องทางเดินปัสสาวะ หรือเสี่ยงเป็นโรคนิ่ว ดังนั้น อย่าลืมเช็กให้ชัวร์ว่าเราวางชามใส่น้ำแมวเอาไว้ให้เค้าเพียงพอในแต่ละวันแล้ว โดยเพื่อนๆ จะสามารถสังเกตว่าเค้ามีพฤติกรรมการดื่มน้ำที่เป็นสัญญาณสุขภาพดีได้ จากการที่เค้า “ดื่มน้ำสม่ำเสมอ” ตลอดทั้งวันโดยเฉพาะ อย่างยิ่งหลังมื้ออาหาร หรือการออกแรงจากกิจกรรมต่างๆ นั่นเองค่ะ\n" +
                "\n"));

        mDataItem.add(new SimpleItem("แล้วน้องแมวต้องดื่มน้ำมากแค่ไหนกันล่ะ?",
                "\n รู้หรือไม่ว่าร่างกายของแมว มีน้ำเป็นส่วนประกอบมากถึง 60% เลย ดังนั้นน้ำจึงเป็นปัจจัยสำคัญที่ทำให้สุขภาพของเค้าแข็งแรง ซึ่งปริมาณน้ำที่ควรได้รับในแต่ละวันนั้นอยู่ที่ประมาณ 60 มิลลิลิตร (มล.) ต่อ น้ำหนักตัว 1 กิโลกรัม ซึ่งหากน้องแมวของเรามีน้ำหนัก 4 กิโลกรัม นั่นหมายความว่า เค้าควรได้รับน้ำอย่างน้อย 240 มล. นั่นเอง อย่างที่บอกไปว่าร่างกายของแมวมีน้ำเป็นองค์ประกอบหลัก ดังนั้นหากเค้าขาดน้ำเพียงแค่ 10% ย่อมส่งผลกระทบต่อร่างกายโดยรวมทั้งหมด เพื่อนๆ ต้องหมั่นสังเกตพฤติกรรมการดื่มน้ำของน้องแมวอยู่เสมอ หากวันใดวันหนึ่งที่เริ่มมีพฤติกรรมแมวที่ไม่ปกติ นั่นอาจจะเป็นสัญญาณสำคัญที่บอกว่าน้องแมวของเรากำลังมีปัญหาก็ได้\n" +
                        "\n สำหรับพฤติกรรมต้องสงสัยที่ควรระวังไว้ให้ดี คือ\n" +
                        "\n 1.\tการที่เค้าดื่มน้ำตลอดเวลาหรือไม่ดื่มเลยตลอดวัน\n" +
                        "\n 2.\tไม่ยอมปัสสาวะในที่ๆ เราจัดไว้ให้ หรือไม่ยอมแม้แต่จะปัสสาวะเลย รวมไปถึงการมีอาการของผิวหนังลอกและแห้ง ผิวแข็งและไม่ยืดหยุ่น\n" +

                        "\n"));

        mDataItem.add(new SimpleItem("วิธีแก้ปัญหา ถ้าน้องแมวกินน้ำน้อย",
                "\n สำหรับใครที่มีปัญหาน้องแมวกินน้ำน้อยนั้น เราขอแนะนำวิธีแก้ไขเบื้องต้น นั่นก็คือ ให้เปลี่ยนภาชนะสำหรับใส่น้ำดื่มของเค้านะคะ โดยให้เลือกชามที่มีกลไกลักษณะคล้ายน้ำพุเล็กๆ พุ่งขึ้นมาตลอดเวลาค่ะ เพราะโดยปกติของ แมวมักถูกดึงดูดด้วยน้ำที่ไหลไปมาไม่หยุดนิ่ง จึงมีแนวโน้มที่เค้าจะดื่มน้ำได้มากขึ้นนั่นเอง แต่หากเปลี่ยนภาชนะแล้วน้องแมวยังมีพฤติกรรมที่ผิดปกติอยู่ แนะนำให้พาเค้าไปพบคุณหมอโดยด่วนนะคะ\n" +
                        "\n จะเห็นได้ว่า “การทานอาหาร” หรือ “การดื่มน้ำ” ของน้องแมวนั้นไม่ใช่เรื่องเล็กๆ อีกต่อไป การคอยหมั่นสังเกตพฤติกรรมของน้องแมว รวมถึงให้อาหารแมวที่ดีมีคุณภาพคือปัจจัยสำคัญที่ช่วยให้เค้ามีสุขภาพร่างกายที่แข็งแรง ครบทั้ง 6 สัญญาณสุขภาพดี น้องแมวจะร่าเริงแจ่มใสได้ ย่อมเริ่มต้นที่ร่างกายแข็งแรงเป็นอันดับแรกค่ะ\n" +
                        "\n"));
    }

    private class CustomAdapter extends RecyclerView.Adapter<CustomHolder> {
        @NonNull
        @Override
        public CustomHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(parent.getContext()).inflate(android.R.layout.simple_list_item_2, parent, false);
            return new CustomHolder(view);
        }

        @Override
        public void onBindViewHolder(@NonNull CustomHolder holder, int position) {
            holder.tvText1.setText(mDataItem.get(position).getText1());
            holder.tvText2.setText(mDataItem.get(position).getText2());
        }

        @Override
        public int getItemCount() {
            return mDataItem.size();
        }
    }

    private class CustomHolder extends RecyclerView.ViewHolder {
        private final TextView tvText1;
        private final TextView tvText2;

        public CustomHolder(@NonNull View itemView) {
            super(itemView);

            tvText1 = (TextView) itemView.findViewById(android.R.id.text1);
            tvText2 = (TextView) itemView.findViewById(android.R.id.text2);
        }
    }
}
