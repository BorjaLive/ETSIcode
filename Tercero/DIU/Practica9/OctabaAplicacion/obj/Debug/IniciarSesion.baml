   M S B A M L   `   `   `  ����L  HSeptimaAplicacion, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null3clr-namespace:OctabaAplicacionOctabaAplicacion  5      $    OctabaAplicacion.IniciarSesion   5      \ XPresentationFramework, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35R NWindowsBase, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35W SPresentationCore, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35D 9http://schemas.microsoft.com/winfx/2006/xaml/presentation    5      R NSystem.Xaml, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089:x,http://schemas.microsoft.com/winfx/2006/xaml     5      Jmc;http://schemas.openxmlformats.org/markup-compatibility/2006     5      @d2http://schemas.microsoft.com/expression/blend/2008     5      0localclr-namespace:OctabaAplicacion     5        N� 
Background  �#7FFFD4 N� Title$ IniciarSesion��5
      .��5      � ��5   
   �� 5       �� ImageSource$ src/uhu.png��6    �� Opacity$	 0.5Q�63    j� TileMode$
 Tile=�6A    j� Viewport$ 0,0,0.1,0.2�6Q    � RowDefinitions 5   
   �� 5      $��3* �6   �� 5      $��1* �6   �� 5      $��1* �6   �� 5      $��2* �6   .+�5   
   �� $��0��6   $��10q�6!   $
��Wrap=�6-   $��48(�6A    �� TextAlignment$ Center=�6O   $��Center=�6f   $��Center=�6�   1/Aplicación de Diseño de Interfaces de Usuario6�   �� 5   
   $��1��6    �� Orientation$ 
Horizontal=�6"   $��Center=�6;   $��Center=�6X   .+�5      �� 
����� �$��20(�6*   	 �� Padding$	 2q�68   
Usuario:6N   �� 5      -   5        $
��User��5      $��20(�6;   $��20,0,0,0q�6I   $	��150��6[   ��6#   �� 6[   5      �� 5   
   $��2��6   $ 
Horizontal=�6"   $��Center=�6;   $��Center=�6X   .+�5      �� 
����� �$��20(�6*   $	 2q�68   Contraseña:6Q   G� 5      -   5        $��PassHide��5      $��20(�6*   $��20,0,0,0q�68   $	��150��6J   �� 5      -   5        $��PassShow��5      $��20(�6&   $��20,0,0,0q�64   $	��150��6F   $y�	Collapsed=�6R   �� 5      -   5        $��14(�5      $��10, 0, 0, 0q�6#   $��5,0,5,0q�68   .��6�   	Mostrar6�   5      �� 5    
   -   5        $��3��5       $��10q�6   $��Center=�6*   $	��Top=�6G   ���	#FFE5FF41.��5!      �� $��18(�6   $��	15,0,15,0q�6&   Enviar6A   5"      5#      5$      