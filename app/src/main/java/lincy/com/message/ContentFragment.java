package lincy.com.message;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.app.Fragment;
import android.view.View;
import android.view.ViewGroup;

public class ContentFragment extends Fragment {

    
    public static final String  SELECTED_ITEM = "selected_item" ;
    
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
        
        Bundle bd = getArguments( ) ;
        
        View view = inflater.inflate(R.layout.fragment_content, null) ;
        //( (TextView ) view ).setText(bd.getString(SELECTED_ITEM)) ;

        return view ;
    }

}