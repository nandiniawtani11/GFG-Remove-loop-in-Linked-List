class Solution
{
    public static void removeLoop(Node head){
      HashMap<Node, Boolean>map=new HashMap<>();
      Node fast=head;
      Node pre=fast;
      while(fast!=null)
      {
          
          if(!map.containsKey(fast))
          {
              map.put(fast,true);
          }
          else
          {
              pre.next=null;
              return;
          }
          pre=fast;
          fast=fast.next;
      }
      return;
    }
}
