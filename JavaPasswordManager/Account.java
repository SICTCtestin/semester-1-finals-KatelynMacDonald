public class Account {
    private String userName;
    private String password;
    private String category;
    private String title;
  
  /* constructors */
  public Account()
  {
    this.userName = "";
    this.password = "";
    this.category="";
    this.title="";
  }
    
  public Account(String userName)
  {
    this.userName = userName;
    this.password = "";
    this.category="";
    this.title="";
  }
  
  public Account(String userName, String password, String category,String title)
  {
    this.userName = userName;
    this.password = password;
    this.category=category;
    this.title=title;
  }

  /* accessors */
  public String getUserName()
  {
    return userName;
  }
    
  public String getpassword()
  {
    return password;
  }

  public String getCategory()
  {
      return category;
  }

  public String getTitle()
  {
      return title;
  }

  /* mutators */
  public void setName(String userName)
  {
    this.userName = userName;
  }
  
  public void setPassword(String password)
  {
    this.password = password;
  }

  public void setCategory(String category)
  {
    this.category = category;
  }

  public void setTitle(String title)
  {
    this.title = title;
  }

}


