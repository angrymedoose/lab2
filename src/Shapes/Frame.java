package Shapes;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import Ellipse.EllipseFactory;
import Line.LineFactory;
import Rectangle.RectangleFactory;
import Round.RoundFactory;
import Square.SquareFactory;
import Triangle.TriangleFactory;

public class Frame extends JFrame implements MouseListener{

	private ArrayList<Shape> list;
	private HashMap<String, Factory> map;
	private Point startPoint, finishPoint;
	private String whatShape = "Line";
	
	public Frame(String name){
		super(name);
		list = new ArrayList<>();
        map = new HashMap<>();
        map.put("Rectangle", new RectangleFactory());
        map.put("Line", new LineFactory());
        map.put("Ellipse", new EllipseFactory());
        map.put("Round", new RoundFactory());
        map.put("Square", new SquareFactory());
        map.put("Triangle", new TriangleFactory());
        //repaint();
        
        JPanel panel = new JPanel();
        
        JButton button = new JButton("Line");
        button.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				
				whatShape = "Line";
			}
        	
        });
        panel.add(button);
        
        JButton button2 = new JButton("Round");
        button2.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				
				whatShape = "Round";
			}
        	
        });
        panel.add(button2);
        
        JButton button3 = new JButton("Rectangle");
        button3.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				
				whatShape = "Rectangle";
			}
        	
        });
        panel.add(button3);
        
        JButton button4 = new JButton("Ellipse");
        button4.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				
				whatShape = "Ellipse";
			}
        	
        });
        panel.add(button4);
        
        JButton button5 = new JButton("Square");
        button5.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				
				whatShape = "Square";
			}
        	
        });
        panel.add(button5);
        
        JButton button6 = new JButton("Triangle");
        button6.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				
				whatShape = "Triangle";
			}
        	
        });
        panel.add(button6);

        JButton button7 = new JButton("Clear");
        button7.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				
				list.clear();
				repaint();
			}
        	
        });
        panel.add(button7);

        
        this.getContentPane().add(BorderLayout.NORTH, panel);
        setMinimumSize(new Dimension(1000, 800));
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        addMouseListener(this);
	}
	
	public void paint(Graphics g){
		g.clearRect(0, 70, 1600, 900);
		for(int i=0; i<list.size(); i++){
			Shape shape = list.get(i);
			Factory fact = map.get(shape.getName());
			Draw draw = fact.getDraw();
			draw.draw(shape, g);
		}
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		startPoint = new Point(e.getX(), e.getY());
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		finishPoint = new Point(e.getX(), e.getY());
		Factory fac = map.get(whatShape);
		Shape shape = fac.getShape(startPoint, finishPoint, Color.black);
		list.add(shape);
		repaint();
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
