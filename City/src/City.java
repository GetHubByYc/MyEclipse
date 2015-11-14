import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Map;
import java.util.Set;

import javax.swing.AbstractListModel;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

import Maptest.*;

@SuppressWarnings("serial")
public class City extends JFrame {
	JFrame jf = new JFrame("学生信息登记");
	// 设置姓名登记文本框
	JLabel jl1 = new JLabel("姓 名:");
	final JTextField jt1 = new JTextField("", 10);
	// 设置性别下拉框
	JLabel jl2 = new JLabel("性 别:");
	@SuppressWarnings("rawtypes")
	JComboBox<?> jc1 = new JComboBox<Object>(new MyComboBox1());
	// 居住地选择
	JLabel jl3 = new JLabel("居住地");
	@SuppressWarnings("rawtypes")
	JComboBox jc2 = new JComboBox<Object>(new MyComboBox2());
	JLabel jl4 = new JLabel("省/直辖市");

	JComboBox jc3 = new JComboBox();
	JLabel jl5 = new JLabel("市/县");

	// 保存按钮
	JButton jb1 = new JButton("保 存");
	// 重置按钮
	JButton jb2 = new JButton("重 置");
	// 学号登记
	JLabel jl6 = new JLabel("学 号");
	final JTextField jt2 = new JTextField("", 20);
	// 联系电话登记
	JLabel jl7 = new JLabel("电 话");
	final JTextField jt3 = new JTextField("", 20);
	public String[] getCity(String pv){
		Map<String,String[]> map = Maptest.model;
		String[] arrCityStrings = map.get(pv);
		return arrCityStrings;
	}
	public void Linkage(){
		jc2.addActionListener(new ActionListener() {
			
			@SuppressWarnings("unchecked")
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String selectItem = (String) jc2.getSelectedItem();
				jc3.removeAll();
				String arrCity[] = getCity(selectItem);
				jc3.setModel(new DefaultComboBoxModel(arrCity));
				
			}
		});
	}
	public City() {
		Container container = getContentPane();
		container.setLayout(new FlowLayout());
		container.add(jl1);
		container.add(jt1); // 容器中加入姓名登记项

		container.add(jl2);
		container.add(jc1); // 容器中加入性别选择下拉框
							// city
		container.add(jl3);
		container.add(jc2);
		container.add(jc3);

		container.add(jl6);
		container.add(jt2); // 容器中加入学号登记项
		container.add(jl7);
		container.add(jt3); // 容器中加入电话号码登记项

		container.add(jb1);
		container.add(jb2);
		
		jf.add(container);
		jf.setVisible(true);
		jf.setSize(300, 500);
		jf.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		Linkage();
	}

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		new City();
	}

}

// 性别下拉框
class MyComboBox1 extends AbstractListModel<Object> implements
		ComboBoxModel<Object> {
	String selecteditem = null;
	String[] xingbie = { "男", "女" };

	@Override
	public int getSize() {
		// TODO 自动生成的方法存根
		return xingbie.length;
	}

	@Override
	public Object getElementAt(int index) {
		// TODO 自动生成的方法存根
		return xingbie[index];
	}

	@Override
	public void setSelectedItem(Object anItem) {
		// TODO 自动生成的方法存根

		selecteditem = (String) anItem;

	}

	@Override
	public Object getSelectedItem() {
		// TODO 自动生成的方法存根
		return selecteditem;
	}
	// 省/直辖市下拉框
}

class MyComboBox2 extends AbstractListModel<Object> implements
		ComboBoxModel<Object> {

	Map<String, String[]> map = Maptest.model;
	Set<String> set = map.keySet();
	Object[] pronvince = set.toArray();

	String selecteditem = null;

	@Override
	public int getSize() {
		// TODO 自动生成的方法存根
		return pronvince.length;
	}

	@Override
	public Object getElementAt(int index) {
		// TODO 自动生成的方法存根
		return pronvince[index];
	}

	@Override
	public void setSelectedItem(Object anItem) {
		// TODO 自动生成的方法存根
		selecteditem = (String) anItem;

	}

	@Override
	public String getSelectedItem() {
		// CityMap cityMap=new CityMap();
		return selecteditem;

	}
	
	

}


