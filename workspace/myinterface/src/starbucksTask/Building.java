package starbucksTask;

public class Building {
   public static void main(String[] args) {
      StarBucks gangnam = new StarBucks();
      StarBucks jamsil = new StarBucks();
      
//      �޴��� �����ϸ� �Ǳ� ������ FormAdapter�� �ۼ��Ѵ�.
      jamsil.register(new FormAdapter() {
         
         @Override
         public String[] getMenu() {
            return new String[] {"��"};
         }
      });
      
      
//      ��� ��ü�� �ۼ��ؾ� �ϱ� ������ Form�� �ۼ��Ѵ�.
      gangnam.register(new Form() {
         
         @Override
         public void sell(String menu) {
            String[] menus = getMenu();
            for (int i = 0; i < menus.length; i++) {
               if(menus[i].equals(menu)) {
                  System.out.println(menu + " �Ǹ� �Ϸ�");
               }
            }
         }
         
         @Override
         public String[] getMenu() {
            return new String[] {"�Ƹ޸�ī��", "īǪġ��", "��������", "�̴Ͼ� �����"};
         }
      });
   }
}








