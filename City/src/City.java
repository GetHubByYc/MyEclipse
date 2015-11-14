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
	JFrame jf = new JFrame("ѧ����Ϣ�Ǽ�");
	// ���������Ǽ��ı���
	JLabel jl1 = new JLabel("�� ��:");
	final JTextField jt1 = new JTextField("", 10);
	// �����Ա�������
	JLabel jl2 = new JLabel("�� ��:");
	@SuppressWarnings("rawtypes")
	JComboBox<?> jc1 = new JComboBox<Object>(new MyComboBox1());
	// ��ס��ѡ��
	JLabel jl3 = new JLabel("��ס��");
	@SuppressWarnings("rawtypes")
	JComboBox jc2 = new JComboBox<Object>(new MyComboBox2());
	JLabel jl4 = new JLabel("ʡ/ֱϽ��");

	JComboBox jc3 = new JComboBox();
	JLabel jl5 = new JLabel("��/��");

	// ���水ť
	JButton jb1 = new JButton("�� ��");
	// ���ð�ť
	JButton jb2 = new JButton("�� ��");
	// ѧ�ŵǼ�
	JLabel jl6 = new JLabel("ѧ ��");
	final JTextField jt2 = new JTextField("", 20);
	// ��ϵ�绰�Ǽ�
	JLabel jl7 = new JLabel("�� ��");
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
		container.add(jt1); // �����м��������Ǽ���

		container.add(jl2);
		container.add(jc1); // �����м����Ա�ѡ��������
							// city
		container.add(jl3);
		container.add(jc2);
		container.add(jc3);

		container.add(jl6);
		container.add(jt2); // �����м���ѧ�ŵǼ���
		container.add(jl7);
		container.add(jt3); // �����м���绰����Ǽ���

		container.add(jb1);
		container.add(jb2);
		
		jf.add(container);
		jf.setVisible(true);
		jf.setSize(300, 500);
		jf.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		Linkage();
	}

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		new City();
	}

}

// �Ա�������
class MyComboBox1 extends AbstractListModel<Object> implements
		ComboBoxModel<Object> {
	String selecteditem = null;
	String[] xingbie = { "��", "Ů" };

	@Override
	public int getSize() {
		// TODO �Զ����ɵķ������
		return xingbie.length;
	}

	@Override
	public Object getElementAt(int index) {
		// TODO �Զ����ɵķ������
		return xingbie[index];
	}

	@Override
	public void setSelectedItem(Object anItem) {
		// TODO �Զ����ɵķ������

		selecteditem = (String) anItem;

	}

	@Override
	public Object getSelectedItem() {
		// TODO �Զ����ɵķ������
		return selecteditem;
	}
	// ʡ/ֱϽ��������
}

class MyComboBox2 extends AbstractListModel<Object> implements
		ComboBoxModel<Object> {

	Map<String, String[]> map = Maptest.model;
	Set<String> set = map.keySet();
	Object[] pronvince = set.toArray();

	String selecteditem = null;

	@Override
	public int getSize() {
		// TODO �Զ����ɵķ������
		return pronvince.length;
	}

	@Override
	public Object getElementAt(int index) {
		// TODO �Զ����ɵķ������
		return pronvince[index];
	}

	@Override
	public void setSelectedItem(Object anItem) {
		// TODO �Զ����ɵķ������
		selecteditem = (String) anItem;

	}

	@Override
	public String getSelectedItem() {
		// CityMap cityMap=new CityMap();
		return selecteditem;

	}
	
	

}

