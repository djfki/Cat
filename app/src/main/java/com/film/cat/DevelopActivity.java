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

public class DevelopActivity extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private ArrayList<SimpleItem> mDataItem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_develop);

        data();

        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getBaseContext()));
        mRecyclerView.setAdapter(new CustomAdapter());
    }

    private void data() {
        mDataItem = new ArrayList<SimpleItem>();
        mDataItem.add(new SimpleItem("พัฒนาการของน้องแมว",
                "\n ใครที่มีโอกาสได้เลี้ยงลูกแมวตัวเล็กจะรู้เลยว่าการเลี้ยงลูกแมวตั้งแต่วัยนี้เป็นช่วงเวลาที่เจ้าของแมวจะมีความสุขมากๆ เพราะนอกจากความน่ารักน่าเอ็นดูแล้ว การเลี้ยงลูกแมวยังถือเป็นหนึ่งในหน้าความทรงจำดีๆ ที่มีต่อลูกแมวตัวน้อย เพราะพัฒนาการลูกแมวในช่วงเวลานี้จะรวดเร็วมาก ลูกแมวจะเติบโตทั้งร่างกายและจิตใจ มีอะไรน่ารักน่าจดจำให้เราได้ยิ้มกันตลอด มาตามติดพัฒนาการลูกแมวกัน แล้วคุณจะพบวิธีเลี้ยงลูกแมวให้สดใสแข็งแรงสมวัย\n" +
                        "\n"));

        mDataItem.add(new SimpleItem("วัยแรกเกิด",
                "\n ช่วงเวลาสัปดาห์แรกหลังจากที่ลูกแมวได้ออกมาสู่โลกกว้างถือเป็นช่วงเวลาสำคัญที่เราต้องดูแลใกล้ชิด ถ้าสังเกตเห็นว่าลูกแมวตาปิดอยู่ก็ไม่ต้องตกใจไป ตาลูกแมวจะค่อยๆ เปิดและจะมองเห็นได้เมื่อเข้าสู่วันที่ 5 สำหรับวัยแรกเกิดนี้ลูกแมวจะใช้เวลาส่วนใหญ่ไปกับการนอนในที่อุ่นๆ และตื่นมาเมื่อถึงเวลาที่แม่แมวจะทำความสะอาดตัวและให้นม ลูกแมวจะเรียนรู้วิธีการดูดนมแม่ หลังจากนั้นลูกแมวก็จะมีน้ำหนักเพิ่มขึ้นทุกๆ วัน\n" +
                        "\n วิธีเลี้ยงลูกแมวในช่วงวัยนี้จึงเน้นไปที่การทำความสะอาดที่อยู่ของแม่แมวและลูกแมว เปิดโคมไฟเพื่อให้ความอบอุ่นกับลูกแมว\n" +
                        "\n"));

        mDataItem.add(new SimpleItem("วัยก่อนหย่านม",
                "\n ลูกแมวเริ่มยืน 4 ขาเมื่อเข้าสู่สัปดาห์ที่ 2 และเริ่มมองเห็นฟันซี่เล็กๆ ได้ช่วงสัปดาห์ที่ 3 ซึ่งจะสามารถรับรู้ถึงสิ่งกระตุ้นจากภายนอกได้ ฝึกหัดลับเล็บ เล่นของเล่น และเดินสำรวจสถานที่รอบๆ บ้าน เริ่มมีการเข้าสังคมกันระหว่างลูกแมวด้วย กัน ช่วงนี้ลูกแมวจะเติบโตอย่างรวดเร็ว และสีตาของลูกแมวจะเริ่มเปลี่ยนจากสีฟ้ามาเป็นสีตาจริงๆ แล้ว\n" +
                        "\n การเลี้ยงลูกแมวในช่วงวัยนี้เน้นการฝึกฝนพัฒนาการลูกแมวในด้านการเข้าสังคม โดยลูกแมวจะเริ่มเรียนรู้การเล่นกับลูกแมวตัวอื่น และรู้จักประเมินน้ำหนักในการเล่นไม่ให้แรงเกินไปจนแมวตัวอื่นบาดเจ็บ แต่สำหรับเจ้าของแมวที่รับลูกแมวมาเลี้ยงตัวแรก ควรฝึกด้วยการเล่นกับของเล่นแมว หากลูกแมวกัดมือและเท้าของเจ้าของแรง ควรดุลูกแมวและไม่ให้ทำอีก เพราะลูกแมวจะจำว่าการเล่นแบบนี้ไม่เป็นไร เมื่อโตขึ้นลูกแมวจะเล่นแรงทั้งกับแมวและกับคน นอกจากนี้ในช่วงวัยนี้ลูกแมวจะเรียนรู้เรื่องการขับถ่ายในกระบะทราย ดูเคล็ดลับง่ายๆฝีกลูกแมวให้ใช่กระบะทรายง่ายๆที่นี่ และเตรียมตัวที่จะเปลี่ยนจากนมแม่มาเป็นอาหารเม็ดแสนอร่อยได้แล้ว\n" +
                        "\n"));

        mDataItem.add(new SimpleItem("วัยหย่านม",
                "\n ปกติลูกแมวจะหย่านมในช่วงอายุ 6-8 สัปดาห์ ช่วงนี้ลูกแมวจะกินนมแม่ลดลง และเริ่มหัดกินอาหารเม็ด เพราะทางเดินอาหารของลูกแมว เริ่มปรับตัวให้ย่อยน้ำตาลแล็คโทส ที่มีในนมได้ลดลง และย่อยอาหารได้ดีขึ้น พร้อมกับมีการเติบโตที่รวดเร็วมากๆ ดังนั้นอาหารที่เลือกให้ลูกแมวจึงต้องมีคุณค่าสารอาหารที่ครบถ้วน มีโปรตีนสูง และทำมาจากวัตถุดิบชั้นดี\n" +
                        "\n วิธีเลี้ยงลูกแมวช่วงเปลี่ยนมากินอาหารเม็ด ให้เริ่มต้นได้ด้วยการผสมน้ำลงในอาหารเม็ด เพื่อให้อาหารเม็ดนิ่มลงในช่วงแรก แล้วค่อยๆ ปรับจนเป็นการกินอาหารเม็ดแบบไม่ต้องผสมน้ำ\n" +
                        "\n"));

        mDataItem.add(new SimpleItem("วัยรุ่น",
                "\n ลูกแมวจะเข้าสู่ช่วงวัยรุ่นหลังจากหย่านมจนถึงอายุ 1 ปี จึงจะเข้าสู่ช่วงโตเต็มวัย ช่วงนี้ลูกแมวจะไม่โตเร็วเท่าก่อนหน้า นี้ แต่จะมีการพัฒนาร่างกายให้แข็งแรงทั้งโครงสร้าง และภูมิคุ้มกัน ควรพาลูกแมวไปทำวัคซีน ถ่ายพยาธิ ตรวจสุขภาพเป็นประจำทุกปีเพื่อป้องกันโรคร้ายแรง และสามารถพาลูกแมวไปทำหมันได้ โดยสามารถพาลูกแมวตัวเมียไปตรวจร่างกายเพื่อเตรียมพร้อมสำหรับการทำหมันได้ตั้งแต่อายุ 5-6 เดือน เพราะระยะนี้ระบบสืบพันธุ์ของลูกแมวตัวเมียเติบโตเต็มที่แล้ว ส่วนลูกแมวตัวผู้ก็สามารถพาไปพบคุณหมอเพื่อตรวจร่างกายเตรียมพร้อมที่จะทำหมันได้ตั้งแต่อายุ 5 เดือน – 1 ปี โดยขึ้นอยู่กับสภาพร่างกายของลูกแมว น้ำหนักตัวของลูกแมว และการพิจารณาของคุณหมอว่าจะเริ่มทำหมันลูกแมวตัวผู้ตอนไหนจึงจะเหมาะสมที่สุด\n" +
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
