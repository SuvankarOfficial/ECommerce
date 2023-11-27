import '../css/LoginPage.css';
import CustomHeader from '../Component/Header/CustomHeader.jsx';
import Username from '../Component/Input/Username.jsx';
import CustomInput from '../Component/Input/CustomInput';

function LoginPage() {
  return (
    <>
      <div className="l-inner-box">
        <CustomHeader inputText="Login to ECommerce" inputType="h2" />
        <form action="">
          <CustomInput
            inputText="Username"
            inputType="text"
            inputId="LoginUsername"
          />
          <CustomInput
            inputText="Password"
            inputType="password"
            inputId="LoginPassword"
          />
          <button type="submit" class="btn btn-primary">
            Submit
          </button>
        </form>
      </div>
    </>
  );
}

export default LoginPage;
