   M S B A M L   `   `   `  ����I  EExamen2020 BIS, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null?$clr-namespace:Examen2020_BIS.paginasExamen2020_BIS.paginas  5      )    #Examen2020_BIS.paginas.Cuestionario   5      \ XPresentationFramework, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35R NWindowsBase, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35W SPresentationCore, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35D 9http://schemas.microsoft.com/winfx/2006/xaml/presentation    5      R NSystem.Xaml, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089:x,http://schemas.microsoft.com/winfx/2006/xaml     5      Jmc;http://schemas.openxmlformats.org/markup-compatibility/2006     5      @d2http://schemas.microsoft.com/expression/blend/2008     5      6local$clr-namespace:Examen2020_BIS.paginas     5        N� 
Background  �#b8ffd2 N� Title$ Cuestionario��5
      .��5      �  � ColumnDefinitions 5   
   �� 5      $��1* �6   �� 5      $��1* �6   �� 5      $��1* �6    � RowDefinitions 5   
   �� 5      $��4* �6   �� 5      $��1* �6   �� 5      $��1* �6   �� 5      $��1* �6   �� 5      $��1* �6   �� 5      $��1* �6   �� 5      $��4* �6   .+�5   
   �� $��22(�6   $��Monotype)�6"   $��Oblique$�68   $��3��6L   $��Center=�6`   $��Bottom=�6}   $��0, 0, 0, 10q�6�   Cuestionario6�   �� 5   
   $��1��6   $��16(�6!   $��Monotype)�6/   $��Oblique$�6E   $��Right=�6Y   $��Center=�6u   $��0, 0, 10, 0q�6�   	Nombre:6�   �� 5   
   $��2��6   $��16(�6!   $��Monotype)�6/   $��Oblique$�6E   $��Right=�6Y   $��Center=�6u   $��0, 0, 10, 0q�6�   Edad:6�   �� 5   
   $��3��6   $��16(�6!   $��Monotype)�6/   $��Oblique$�6E   $��Right=�6Y   $��Center=�6u   $��0, 0, 10, 0q�6�   Contraseña:6�   �� 5   
   $��4��6   $��16(�6!   $��Monotype)�6/   $��Oblique$�6E   $��Right=�6Y   $��Center=�6u   $��0, 0, 10, 0q�6�   
Salario:6�   �� 5   
   $��5��6   $��16(�6!   $��Monotype)�6/   $��Oblique$�6E   $��Right=�6Y   $��Center=�6u   $��0, 0, 10, 0q�6�   Nacionalidad:6�   �� 5    
   -   5        $��1��5       $��1��6   $��
0, 2, 0, 2q�6/   $��16(�6C    � Cursor$	 Pen��6Q   .��6�    � ToolTip$' !Mínimo 3 caracteres y máximo 10��5#      .��5$      �� 5%   
   -   5        $��2��5%      $��1��6   $��
0, 2, 0, 2q�6/   $��16(�6C   $	 Pen��6Q   .��6�   $. (La edad debe estar entre 18 y 100 años.��5(      .��5)      G� 5*   
   -   5        $��PassText��5*      $��3��6&   $��1��63   $��
0, 2, 0, 2q�6C   $��16(�6W   $	 Pen��6e    G� PasswordChar$ *��6�   $1 +Sólo se permite dígitos en la contraseña��5-   #   5.      �� 5/   
   -   5        $��	ClearText��5/      $��3��6#   $��1��60   $��
0, 2, 0, 2q�6@   $��16(�6T   $	 Pen��6b   $y�	Collapsed=�6o   �� 50   
   -   5        $��4��50      $��1��6   $��Center=�6.    � Minimum$ 0Q�6I    � Maximum$ 100000Q�6U   	 �� IsSnapToTickEnabled	 . 6�   �� 51   
   $��5��6   $��1��6    $��
0, 2, 0, 2q�60   ��6D   �� �� 52   
   -   5        $��3��52      $��2��6   $��10, 0, 0, 0q�6.   $��	10,5,10,5q�6C   $
��Left=�6W   $��Center=�6r   .��6�   	Mostrar6�   �� 53   
   -   5        $��SalarioText��53      $��4��6'   $��2��64   $��16(�6D   $��Monotype)�6R   $��Oblique$�6h   $
��Left=�6|   $��Center=�6�   $��10, 0, 0, 0q�6�   �� 54   
   -   5        $��6��54      $��3��6   $��Center=�62   $	��Top=�6O   $��16(�6g   $��0, 10, 0, 0q�6u   $��10, 5, 10, 5q�6�   .��6�   Enviar56      57      58      