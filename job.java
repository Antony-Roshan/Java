import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class Job extends Applet implements ItemListener,ActionListener 
{
Label
heading,Name,Gender,Age,Dob,Address,Pin,City,State,Phn,Qual,WorkExp,Language,Email;
TextField tName,tAge,tAddress,tAddress2,tPin,tQual,tPhn,tWorkExp,tEmail,tCity;
CheckboxGroup checkGroup;
Checkbox cbMale,cbFemale,cbLangOth,cbLangC,cbLangJava,cbLangAnd,cbLangPhp;
Choice st,dd,mm,yy;
Button btnSubmit;
String val,msg;

public void init()
{
setLayout(null);
heading = new Label("APPLICATION FORM");
heading.setBounds(250,10,400,50);
heading.setFont(new Font("TimesRoman",Font.BOLD,30));
add(heading);
Name = new Label("Name: ");
Name.setBounds(40,90,50,50);
add(Name);
tName = new TextField(15);
tName.setBounds(150,100,150,30);
add(tName);
Gender = new Label("Gender: ");
Gender.setBounds(40,150,90,70);
75
add(Gender);
checkGroup = new CheckboxGroup(); 
cbMale=new Checkbox("Male",checkGroup,false); 
cbFemale = new Checkbox("Female",checkGroup,true);
cbMale.setBounds(150,150,70,30);
cbFemale.setBounds(230,150,70,30); 
add(cbMale);
add(cbFemale);
cbMale.addItemListener(this);
cbFemale.addItemListener(this);
Age = new Label("Age: ");
Age.setBounds(40,210,100,70);
add(Age);
tAge = new TextField(15);
tAge.setBounds(150,230,150,30);
add(tAge);
Dob = new Label("Date of Birth: ");
Dob.setBounds(40,260,90,70);
add(Dob);
dd= new Choice();
dd.addItem("DD");
for(int i=1;i<=31;i++)
{
if(i<10)
dd.addItem("0"+i);
else
dd.addItem(""+i);
}
dd.setBounds(150,280,45,30);
add(dd);
dd.addItemListener(this);
mm = new Choice();
mm.addItem("MM");
for(int k=1;k<=12;k++)
{
if(k<10)
mm.addItem("0"+k);
76
else
mm.addItem(""+k);
}
mm.setBounds(210,280,55,30);
add(mm);
mm.addItemListener(this);
yy = new Choice();
yy.addItem("YYYY");
for(int j=1980;j<=2020;j++)
{
yy.addItem(" "+j);
}
yy.setBounds(270,280,60,30);
add(yy);
yy.addItemListener(this);
Address=new Label("Address:");
Address.setBounds(40,320,90,70);
add(Address);
tAddress=new TextField(15);
tAddress.setBounds(150,340,150,30);
add(tAddress);
tAddress2 = new TextField(15);
tAddress2.setBounds(150,400,150,30);
add(tAddress2);
Pin=new Label("Pin:");
Pin.setBounds(40,440,90,70);
add(Pin);
tPin=new TextField(15);
tPin.setBounds(150,460,150,30);
add(tPin);
City=new Label("City:");
City.setBounds(40,500,90,70);
add(City);
tCity=new TextField(15);
tCity.setBounds(150,520,150,30);
add(tCity);
77
State=new Label("State :");
State.setBounds(40,560,90,70);
add(State);
st=new Choice();
st.addItem("Kerala");
st.add("Andra Pradesh");
st.add("Arunachal Pradesh");
st.add("Assam");
st.add("Bihar");
st.add("Chhattisgarh");
st.add("Goa");
st.add("Gujarat");
st.add("Haryana");
st.add("Himachal Pradesh");
st.add("Jammu & Kashmir");
st.add("Jharkhand");
st.add("Karnataka");
st.add("Kerala");
st.add("Madhya Pradesh");
st.add("Maharashtra");
st.add("Manipur");
st.add("Meghalaya");
st.add("Mizoram");
st.add("Nagaland");
st.add("Odisha");
st.add("Punjab");
st.add("Rajasthan");
st.add("Sikkim");
st.add("Tamilnadu");
st.add("Telangana");
st.add("Tripura");
st.add("Uttar Pradesh");
st.add("Uttarakhand");
st.add("West Bengal");
st.setBounds(150,580,150,30);
add(st);
st.addItemListener(this);
Phn = new Label("Phone :");
Phn.setBounds(40,620,90,70);
78
add(Phn);
tPhn = new TextField(15);
tPhn.setBounds(150,640,150,30);
add(tPhn);
Qual = new Label("Qualification :");
Qual.setBounds(340,80,90,70);
add(Qual);
tQual = new TextField(15);
tQual.setBounds(480,100,150,30);
add(tQual);
WorkExp=new Label("Work Experience:");
WorkExp.setBounds(340,200,110,70);
add(WorkExp);
tWorkExp=new TextField(15);
tWorkExp.setBounds(480,220,150,30);
add(tWorkExp);
Email=new Label("Email:");
Email.setBounds(340,260,110,70);
add(Email);
tEmail=new TextField(15);
tEmail.setBounds(480,280,150,30);
add(tEmail);
Language=new Label("Language Known:");
Language.setBounds(340,320,100,30);
add(Language);
cbLangC=new Checkbox("c++");
cbLangJava=new Checkbox("java");
cbLangAnd=new Checkbox("android");
cbLangPhp=new Checkbox("php");
cbLangOth=new Checkbox("others");
cbLangC.setBounds(480,320,80,30);
cbLangJava.setBounds(580,320,70,30);
cbLangAnd.setBounds(480,380,70,30);
cbLangPhp.setBounds(580,380,70,30);
cbLangOth.setBounds(480,440,70,30);
add(cbLangC);
79
add(cbLangJava);
add(cbLangAnd);
add(cbLangPhp);
add(cbLangOth);
cbLangC.addItemListener(this);
cbLangJava.addItemListener(this);
cbLangAnd.addItemListener(this);
cbLangPhp.addItemListener(this);
cbLangOth.addItemListener(this);
btnSubmit=new Button("Submit");
btnSubmit.setBounds(520,520,100,30);
add(btnSubmit);
btnSubmit.addActionListener(this);
}
public void itemStateChanged(ItemEvent ae)
{
repaint();
}
public void actionPerformed(ActionEvent ap)
{
msg=ap.getActionCommand();
if(msg.equals("Submit"));
{
val="\tJOB APPLICATION
FORM\n\n"+"Name\t\t:"+tName.getText()+"\nGender\t\t:"+checkGroup.getSelectedCheckbox().
getLabel()+"\nAge\t\t:"+tAge.getText()+"\nDate Of
Birth\t\t:"+dd.getSelectedItem()+"/"+mm.getSelectedItem()+" /
"+yy.getSelectedItem()+"\nAddress\t\t:"+tAddress.getText()+"\n\t\t"+tAddress2.getText()+"\nPi
n\t\t:"+tPin.getText()+"\nCity\t\t:"+tCity.getText()+"\nState\t\t:"+st.getSelectedItem()+"\nPhone\
t\t:"+tPhn.getText()+"\nQualification\t\t:"+tQual.getText()+"\nWorkExprience\t\t:"+tWorkExp.g
etText()+"\nEmail\t\t:"+tEmail.getText()+"\nLanguageKnown:"+"c++:"+cbLangC.getState()+"\
n\t\tjava:"+cbLangJava.getState()+"\n\t\tandroid:"+cbLangAnd.getState()+"\n\t\tphp:"+cbLangP
hp.getState()+"\n\t\tothers"+cbLangOth.getState();
TextArea text=new TextArea(val,10,10);
text.setBounds(750,110,400,400);
add(text);
}
}
}
80
/* <body>
<applet code = "Job.class" height = 600 width=600>
</applet>
</body> */