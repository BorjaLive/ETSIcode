   M S B A M L   `   `   `  ����J  FSextaAplicacion, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null1clr-namespace:SextaAplicacionSextaAplicacion  5   	        SextaAplicacion.MainWindow   5   	   \ XPresentationFramework, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35R NWindowsBase, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35W SPresentationCore, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35D 9http://schemas.microsoft.com/winfx/2006/xaml/presentation    5   	   R NSystem.Xaml, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089:x,http://schemas.microsoft.com/winfx/2006/xaml     5   	   @d2http://schemas.microsoft.com/expression/blend/2008     5   	   Jmc;http://schemas.openxmlformats.org/markup-compatibility/2006     5   	   /localclr-namespace:SextaAplicacion     5   	     � WindowStartupLocation$  CenterScreen=�5   	    � 
ResizeMode$ CanMinimize=�5	   	    � Title$ Sexta Aplicación��5
   	   $	��450��6"   $	��724��6/    � Icon$ src/icon.png��6;   ��5      
� 5   
   .��5      �  � Color$
 Cyan��6    � Offset$ 0Q�6(   � 5      $ Black��6   $ 1Q�6)   5      .��5      �  � RowDefinitions 5   
   �� 5      $��2* �6   �� 5      $��6* �6   �� 5      $��1* �6   .+�5   
   �� -   5        $��pantalla��5   9    �� Orientation$ Vertical=�6   $��0��6,   .+�5      �� $ 
Horizontal=�6   $��Center=�62   $��5q�6O   .+�5      �� 
���  ��
������� �� Padding$ 2q�6@   
ROJO (R)6V   �� 5      -   5        $��
sliderRojo��5   U   	 � Minimum$	 0Q�6   
 � Maximum$	
 255Q�6%   $	��350��63   $��20, 0, 20, 0q�6?    �� IsSnapToTickEnabled . 6�   �� 5      -   5        $��	valorRojo��5   ;   
�������$ 2q�6/   	Valor = 06W   5      �� 5      $ 
Horizontal=�6   $��Center=�62   $��5q�6O   .+�5      �� 
��� � �
�������$ 2q�6B   
ROJO (R)6X   �� 5      -   5        $��sliderVerde��5   U   $	 0Q�6   $	
 255Q�6%   $	��350��63   $��20, 0, 20, 0q�6?    . 6�   �� 5       -   5        $��
valorVerde��5    ;   
�������$ 2q�6/   	Valor = 06X   5!      �� 5"      $ 
Horizontal=�6   $��Center=�62   $��5q�6O   .+�5#      �� 
����  �
�������$ 2q�6A   
ROJO (R)6W   �� 5$      -   5        $��
sliderAzul��5$   U   $	 0Q�6   $	
 255Q�6%   $	��350��63   $��20, 0, 20, 0q�6?    . 6�   �� 5%      -   5        $��	valorAzul��5%   ;   
�������$ 2q�6/   	Valor = 06W   5&      5'      (  "System.Windows.Controls.WebBrowser  5(   
   $��1��6      Source$ http://uhu.es/?�6"   d� 5)   
   -   5        $��2��5)      $��Right=�6$   $	��100��6@   $��30��6L   
��� ���.��6�   BORRAR5+      5,      5-      