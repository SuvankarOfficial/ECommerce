export default function CustomHeader({ inputText, inputType }) {
  return (
    <>
      {(() => {
        switch (inputType) {
          case 'h1':
            return <h1 style={{ textAlign: 'center' }}>{inputText}</h1>;
          case 'h2':
            return <h2 style={{ textAlign: 'center' }}>{inputText}</h2>;
          case 'h3':
            return <h3 style={{ textAlign: 'center' }}>{inputText}</h3>;
          default:
            return <div style={{ textAlign: 'center' }}>{inputText}</div>;
        }
      })()}
    </>
  );
}
