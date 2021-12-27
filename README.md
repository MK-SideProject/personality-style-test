# personality-style-test 유형테스트.zip

![logo_main](https://user-images.githubusercontent.com/77378559/147445274-b4dd9612-7f86-44a0-b2ef-cc20560e0d86.png)

특정 상황에서의 성격 유형 테스트와 유머스러운 소재로 만든 유머 테스트, 찐 성격 테스트에서 나의 성격 유형과 어울리는 성격 유형 궁합까지
지루한 시간을 즐겁게 해주는 유형 테스트 모음집 어플입니다!

***

# 개요

- 프로젝트 이름 : 유형테스트.zip
- 개발 기간 : 11월 8일 ~ 12월 16일
- 어플 다운로드 링크 : https://play.google.com/store/apps/details?id=com.mk.personality_style_test

***

# 설명

✔ Main

![유형테스트1](https://user-images.githubusercontent.com/77378559/147445996-441abaa5-faeb-4065-b0ef-690fcd6bd388.jpg)

- 어플 첫 시작시 로고가 몇 초간 보여지고 메인 화면으로 이동합니다
- 위의 이미지가 어플 메인화면입니다

***

✔ 유형테스트

![유형테스트2](https://user-images.githubusercontent.com/77378559/147446193-a4895374-05f7-4c2c-97c9-5a835075d968.jpg)

- 메인화면에서 유형테스트 버튼을 누르면 나오는 화면입니다
- 각각의 상황에 따라 유형 테스트를 할 수 있습니다

***

✔ 유형테스트 결과

![KakaoTalk_20211227_163614443](https://user-images.githubusercontent.com/77378559/147448077-033de70e-a985-48bc-bcb2-15ef63f7e323.jpg)

- 모든 테스트에 대한 결과화면은 위와 비슷한 느낌으로 나옵니다
- 결과화면에서는 다시하기 버튼과 목록으로 돌아가는 버튼이 있어 사용자가 사용하기 쉽게 구현을 했습니다

***

✔ 유머 테스트

![유형테스트3](https://user-images.githubusercontent.com/77378559/147446385-8ec305a9-d4b0-4769-8810-c12a370bdbfd.jpg)

- 메인화면에서 유머테스트 버튼을 누르면 나오는 화면입니다
- 기존의 성격 테스트나 유형테스트보다는 유머스러운 소재를 가지고 있는 테스트들 입니다

***

✔ 성격유형 테스트

<img src="https://user-images.githubusercontent.com/77378559/147446610-cd5f8f8a-6c39-4b48-b76b-c9ab05236ab1.jpg" width="320" /> &nbsp;&nbsp; <img src="https://user-images.githubusercontent.com/77378559/147446618-8d597f92-bebf-4a54-8db2-3dffe8d805f8.jpg" width="320" />

- 메인화면에서 찐테스트 버튼을 누르면 나오는 화면입니다.
- 성격유형테스트에서 시작하기 버튼을 누르면 2번째 이미지처럼 성격유형테스트를 할 수 있습니다

***

✔ 궁합 테스트

![유형테스트4](https://user-images.githubusercontent.com/77378559/147446764-a81b3c44-98ee-4094-9d32-d150ab984f82.jpg)

- 메인화면에서 궁합 버튼을 누르면 나오는 화면입니다.
- 찐테스트에서 성격유형테스트를 하고 나온 결과를 입력하면 다른 유형들과 궁합을 보여주는 기능을 가지고있습니다

***

# 주요 코드 설명

<details>
<summary>리스트 코드 설명</summary>
<div markdown="1">       
  - 각 리스트뷰는 아이템리스트와 아이템어댑터로 이루어져 있습니다
</div>
  <div markdown="2">       
  - 아이템리스트는 아래 코드와 같습니다
    <br>
    <pre><code> public PersonalityItem(String title_resource1, String description_resource1, String time_resource1, int img_resource1){
       this.title_resource1 = title_resource1;
       this.description_resource1 = description_resource1;
       this.time_resource1 = time_resource1;
       this.img_resource1 = img_resource1;
     } </code></pre>
   
</div>
  <div markdown="3">       
  - 아이템리스트를 가져오는 건 어댑터로 하였고 주요 코드는 이러합니다
    <br>
    <pre><code>@Override
        public View getView(int position, View convertView, ViewGroup parent){
            PersonalityItemView personalityItemView = null;
            if(convertView ==null){
                personalityItemView = new PersonalityItemView(getApplicationContext());

            }else{
                personalityItemView = (PersonalityItemView)convertView;
            }
            PersonalityItem item = items.get(position);
            personalityItemView.setTitle_resource1(item.getTitle_resource1());
            personalityItemView.setDescription_resource1(item.getDescription_resource1());
            personalityItemView.setTime_resource1(item.getTime_resource1());
            personalityItemView.setImg_resource1(item.getImg_resource1());
            return personalityItemView;
        } </code></pre>
</div>
</details>

<details>
<summary>테스트 코드 설명</summary>
<div markdown="1">       
  - 테스트는 질문에 대한 버튼을 눌러 다음 액티비티로 값을 넘겨주는게 중요했습니다
</div>
 <div markdown="2">       
  - 이런한 값을 넘겨주는 코드는 
     <br>
  <pre><code>bankingtest_1_an1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String bankigtest_result1 = "result1";

                Intent intent = new Intent(getBaseContext(), bankingtest_2_Activity.class);
                intent.putExtra("bankingtest_result1", bankigtest_result1);

                startActivity(intent);
            }
        });
bankingtest_2_an1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = getIntent();
                Bundle bundle = intent.getExtras();

                String bankingtest_result1 = bundle.getString("bankingtest_result1");
                String bankingtest_result2 = bundle.getString("bankingtest_result2");
                String bankingtest_result3 = bundle.getString("bankingtest_result3");

                Intent intent2 = new Intent(getBaseContext(), bankingtest_3_Activity.class);
                intent2.putExtra("bankingtest_result1", bankingtest_result1);
                intent2.putExtra("bankingtest_result2", bankingtest_result2);
                intent2.putExtra("bankingtest_result3", bankingtest_result3);
                //Toast.makeText(getApplicationContext(), bankingtest_result1,Toast.LENGTH_SHORT).show();
                startActivity(intent2);
            }
        });</code></pre>
</div>
<div markdown="3">
  - 이러한 방식을 사용해 순차적으로 값을 넘겨줬습니다

 </div>
</details>

<details>
<summary>테스트 코드 설명</summary>
<div markdown="1">       
  - 마지막으로 값을 넘겨받은 마지막 액티비티에서 테스트 결과를 어떻게 마무리했는지 설명해드리겠습니다
</div>
  <div markdown="2">       
  - 위에서 설명한 것과 같이 버튼에 대한 값을 넘겨 받고 마지막에 if문 처리를 해줬습니다
    <br>
    <pre><code>bankingtest_6_an1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent5 = getIntent();
                Bundle bundle = intent5.getExtras();

                String bankingtest_result1 = bundle.getString("bankingtest_result1");
                String bankingtest_result2 = bundle.getString("bankingtest_result2");
                String bankingtest_result3 = bundle.getString("bankingtest_result3");

                if(bankingtest_result3!= null && bankingtest_result3.equals("result3") ){
                    Intent intent6 = new Intent(getBaseContext(), bankingtest_result3_Activity.class);
                    //Toast.makeText(getApplicationContext(), bankingtest_result1,Toast.LENGTH_SHORT).show();
                    startActivity(intent6);
                }
                else if(bankingtest_result1!= null && bankingtest_result1.equals("result1")){
                    Intent intent6 = new Intent(getBaseContext(), bankingtest_result1_Activity.class);
                    //Toast.makeText(getApplicationContext(), bankingtest_result1,Toast.LENGTH_SHORT).show();
                    startActivity(intent6);
                }
                else{
                    Intent intent6 = new Intent(getBaseContext(), bankingtest_result2_Activity.class);
                    //Toast.makeText(getApplicationContext(), bankingtest_result1,Toast.LENGTH_SHORT).show();
                    startActivity(intent6);

                }


            }
        });</code></pre>
</div>
  <div markdown="3">       
  - if문을 안드로이드에서는 그냥 하면 null값등에 충돌이 있기에 if문의 코드를 이렇게 작성해줘야했습니다
    <br>
    <pre><code>if(bankingtest_result3!= null && bankingtest_result3.equals("result3") )</code></pre>
</div>
 </details>



